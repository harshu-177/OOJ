import java.util.Scanner;

class Student {
    String USN, Name;
    double mark, sum;

    Scanner sc = new Scanner(System.in);
    double marks[] = new double[6];
    Student(String USN, String Name) {
        this.USN = USN;
        this.Name = Name;
    }

    void getMarks() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter Sub:" + (i + 1) + " Mark (Out of 100) : ");
            mark = sc.nextDouble();     
            marks[i] = mark;
        }
    }
    double totalMarks_percent() {
        for (int i = 0; i < 6; i++) {
            sum = sum + marks[i];
        }
        return (sum/6);
    }
}


class SRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student USN: ");
        String USN = sc.next();
        System.out.println("Enter Student Name: ");
        String name = sc.next();
        
        Student s1 = new Student(USN, name);
        s1.getMarks();
        double percentage = s1.totalMarks_percent();
        
        System.out.println("Total percentage of Student with USN:" + s1.USN + " & NAME: " + s1.Name +" is : " + percentage);

    }
}