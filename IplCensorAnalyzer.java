import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IplCensorAnalyzer {

    public static void main(String[] args) {
        try {
            processJson("ipl_data.json", "censored_ipl_data.json");
            processCsv("ipl_data.csv", "censored_ipl_data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processJson(String inputFilePath, String outputFilePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new FileReader(inputFilePath));
        ArrayNode censoredArray = mapper.createArrayNode();

        if (root.isArray()) {
            for (JsonNode node : root) {
                ObjectNode censoredNode = (ObjectNode) node.deepCopy();
                censorJsonNode(censoredNode);
                censoredArray.add(censoredNode);
            }
        }
        mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(outputFilePath), censoredArray);
    }

    public static void censorJsonNode(ObjectNode node) {
        if (node.has("team1")) {
            node.put("team1", maskTeamName(node.get("team1").asText()));
        }
        if (node.has("team2")) {
            node.put("team2", maskTeamName(node.get("team2").asText()));
        }
        if (node.has("player_of_match")) {
            node.put("player_of_match", "REDACTED");
        }
    }

    public static String maskTeamName(String teamName) {
        String[] parts = teamName.split(" ");
        if (parts.length > 1) {
            return parts[0] + " ***";
        }
        return teamName;
    }

    public static void processCsv(String inputFilePath, String outputFilePath) throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader(inputFilePath));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath))) {

            String[] header = reader.readNext();
            writer.writeNext(header);

            String[] line;
            while ((line = reader.readNext()) != null) {
                String[] censoredLine = censorCsvLine(line);
                writer.writeNext(censoredLine);
            }
        }
    }

    public static String[] censorCsvLine(String[] line) {
        String[] censoredLine = line.clone();
        for (int i = 0; i < censoredLine.length; i++) {
            if (i == getColumnIndex("team1") || i == getColumnIndex("team2")) {
                censoredLine[i] = maskTeamName(censoredLine[i]);
            } else if (i == getColumnIndex("player_of_match")) {
                censoredLine[i] = "REDACTED";
            }
        }
        return censoredLine;
    }

    public static int getColumnIndex(String columnName) {

        if (columnName.equals("team1")){
            return 4;
        }
        if (columnName.equals("team2")){
            return 5;
        }
        if(columnName.equals("player_of_match")){
            return 9;
        }
        return -1;
    }
}