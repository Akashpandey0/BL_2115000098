class Course {
    String courseName;
    int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    String platform; // e.g., Coursera, Udemy
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee * (1 - discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + getFinalFee());
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        Course generalCourse = new Course("Introduction to Programming", 20);
        generalCourse.displayCourseInfo();
        System.out.println("--------------------");

        OnlineCourse onlineCourse = new OnlineCourse("Web Development Fundamentals", 30, "Udemy", true);
        onlineCourse.displayCourseInfo();
        System.out.println("--------------------");

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 40, "Coursera", true, 200, 10);
        paidCourse.displayCourseInfo();
        System.out.println("--------------------");

        //Polymorphism Example
        Course myCourse;

        myCourse = generalCourse;
        myCourse.displayCourseInfo();
        System.out.println("--------------------");

        myCourse = onlineCourse;
        myCourse.displayCourseInfo();
        System.out.println("--------------------");

        myCourse = paidCourse;
        myCourse.displayCourseInfo();
        System.out.println("--------------------");
    }
}