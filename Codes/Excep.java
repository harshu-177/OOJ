import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge() {
        super("Invalid age!");
    }
}

class Father {
    private int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge();
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new WrongAge();
        }
        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return sonAge;
    }
}

class EMain{
    public static void main(String[] args) {

        System.out.println("NAME: HARSHITH B");
        System.out.println("USN:  2023BMS02519\n");
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter father's age: ");
            int fatherAge = sc.nextInt();

            System.out.print("Enter son's age: ");
            int sonAge = sc.nextInt();

            Father father = new Father(fatherAge);
            System.out.println("Father's age: " + father.getAge());

            Son son = new Son(fatherAge, sonAge);
            System.out.println("Son's age: " + son.getSonAge());
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}