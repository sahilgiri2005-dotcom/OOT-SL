public class Student {
    String name;
    int rollNo;
    double marks;

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Marks: " + marks);
    }

    // Method to check pass/fail status
    public boolean isPassed() {
        return marks >= 40.0;
    }

    public static void main(String[] args) {
        // Creating objects of Student class
        Student s1 = new Student();
        s1.name = "Sahil";
        s1.rollNo = 101;
        s1.marks = 78.5;

        Student s2 = new Student();
        s2.name = "Akash";
        s2.rollNo = 102;
        s2.marks = 36.0;

        s1.displayDetails();
        System.out.println("Status: " + (s1.isPassed() ? "Pass" : "Fail"));

        s2.displayDetails();
        System.out.println("Status: " + (s2.isPassed() ? "Pass" : "Fail"));
    }
}