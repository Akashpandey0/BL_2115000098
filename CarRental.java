
class CarRental {
    String cN, cM;
    int rD;
    double rate = 500;

    CarRental(String cN, String cM, int rD) {
        this.cN = cN;
        this.cM = cM;
        this.rD = rD;
    }

    double totalCost() {
        return rD * rate;
    }
}
