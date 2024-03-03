import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class PackagesHandling {
    public static void main(String[] args) {

        System.out.println("NAME: HARSHITH B");
        System.out.println("USN:  2023BMS02519\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Internals[] cieStudents = new Internals[n];
        External[] seeStudents = new External[n];
        for (int i = 0; i < n; i++) {
            cieStudents[i] = new Internals();
            seeStudents[i] = new External();
            
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("USN: ");
            cieStudents[i].usn = seeStudents[i].usn = sc.next();
            System.out.print("Name: ");
            cieStudents[i].name = seeStudents[i].name = sc.next();
            System.out.print("Semester: ");
            cieStudents[i].sem = seeStudents[i].sem = sc.nextInt();

            System.out.println("Enter Internal Marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                cieStudents[i].internalMarks[j] = sc.nextInt();
            }

            System.out.println("Enter External Marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                seeStudents[i].seeMarks[j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                seeStudents[i].seeMarks[j] += cieStudents[i].internalMarks[j];
            }
        }

        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("USN: " + cieStudents[i].usn);
            System.out.println("Name: " + cieStudents[i].name);
            System.out.println("Semester: " + cieStudents[i].sem);

            System.out.println("Total Marks:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Course " + (j + 1) + ": " + seeStudents[i].seeMarks[j]);
            }

            System.out.println();
        }
        sc.close();
    }
}