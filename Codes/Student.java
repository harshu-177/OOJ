import java.util.Scanner;

class Student {
    private String usn;
    private String name;
    private int[] credits;
    private int[] marks;

    public Student(String usn, String name, int[] credits, int[] marks) {
        this.usn = usn;
        this.name = name;
        this.credits = credits;
        this.marks = marks;
    }

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter USN:  ");
        this.usn = sc.next();

        System.out.print("Enter Name:  ");
        this.name = sc.next();
        sc.next();

        this.marks = new int[credits.length];
        for (int i = 0; i < credits.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ":  ");
            this.marks[i] = sc.nextInt();
        }
    }

    public void displayDetails() {
        System.out.println("USN: " + this.usn);
        System.out.println("Name: " + this.name);
        System.out.print("Credits: ");
        for (int i = 0; i < credits.length; i++) {
            System.out.print(credits[i]);
            if(i + 1 != marks.length) System.out.print(", ");
        }
        System.out.println();
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            if(i + 1 != marks.length) System.out.print(", ");
        }
        System.out.println();
    }

    public double calculateSGPA() {
        double totalCredits = 0;
        double totalGradePoints = 0;
        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            totalGradePoints += calculateGradePoint(marks[i]) * credits[i];
        }
        return totalGradePoints / totalCredits;
    }

    private double calculateGradePoint(int mark) {
        if (mark >= 90) return 10;
        else if (mark >= 80) return 9;
        else if (mark >= 70) return 8;
        else if (mark >= 60) return 7;
        else if (mark >= 50) return 6;
        else if (mark >= 40) return 5;
        else return 0;
    }
}

class SRun {
    public static void main(String[] args) {

        System.out.println("NAME: HARSHITH B");
        System.out.println("USN:  2023BMS02519\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects:  ");
        int numOfSubjects = sc.nextInt();

        int[] credits = new int[numOfSubjects];
        System.out.println("Enter credits for each subject:");
        for (int i = 0; i < numOfSubjects; i++) {
            credits[i] = sc.nextInt();
        }

        Student student = new Student("", "", credits, new int[numOfSubjects]);
        student.acceptDetails(sc);
        student.displayDetails();
        System.out.println("SGPA: " + student.calculateSGPA());

        sc.close();
    }
}
