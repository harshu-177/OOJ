import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Internals[] cieStudents = new Internals[n];
        External[] seeStudents = new External[n];
        for (int i = 0; i < n; i++) {
            cieStudents[i] = new Internals();
            System.out.println("Enter details for CIE of Student " + (i + 1) + ":");
            System.out.print("USN: ");
            cieStudents[i].usn = scanner.next();
            System.out.print("Name: ");
            cieStudents[i].name = scanner.next();
            System.out.print("Semester: ");
            cieStudents[i].sem = scanner.nextInt();

            System.out.println("Enter Internal Marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                cieStudents[i].internalMarks[j] = scanner.nextInt();
            }
        }

        // Input SEE marks
        for (int i = 0; i < n; i++) {
            seeStudents[i] = new External();
            System.out.println("Enter details for SEE of Student " + (i + 1) + ":");
            System.out.print("USN: ");
            seeStudents[i].usn = scanner.next();
            System.out.print("Name: ");
            seeStudents[i].name = scanner.next();
            System.out.print("Semester: ");
            seeStudents[i].sem = scanner.nextInt();

            System.out.println("Enter External Marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                seeStudents[i].seeMarks[j] = scanner.nextInt();
            }
        }

        // Display final marks
        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("USN: " + cieStudents[i].usn);
            System.out.println("Name: " + cieStudents[i].name);
            System.out.println("Semester: " + cieStudents[i].sem);

            System.out.println("CIE Marks:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Course " + (j + 1) + ": " + cieStudents[i].internalMarks[j]);
            }

            System.out.println("SEE Marks:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Course " + (j + 1) + ": " + seeStudents[i].seeMarks[j]);
            }

            System.out.println();
        }
        scanner.close();
    }
}
