import java.math.*;
import java.util.Scanner;

class Quad {
    double a, b, c, firstroot, secondroot;

    Quad(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void Eval() {
        double det = b * b - 4 * a * c;

    if (det > 0) {

			firstroot = (-b + Math.sqrt(det)) / (2 * a);
			secondroot = (-b - Math.sqrt(det)) / (2 * a);

			System.out.format(
				"First Root = %.2f and Second Root = %.2f",
				firstroot, secondroot);
		}

		else if (det == 0) {

			firstroot = secondroot = -b / (2 * a);

			System.out.format(
				"First Root = Second Root = %.2f;",
				firstroot);
		}

		else {

			double real = -b / (2 * a);

			double img = Math.sqrt(-det) / (2 * a);

			System.out.printf("First Root = %.2f+%.2fi",
							real, img);
			System.out.printf("\nSecond Root = %.2f-%.2fi",
							real, img);
		}
    }
    
}


class QRun {
	public static void main(String[] args) {
		double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextDouble();
        System.out.print("Enter b : ");
        b = sc.nextDouble();
        System.out.print("Enter c : ");
        c = sc.nextDouble();

        Quad q = new Quad(a, b, c);
        q.Eval();
	}
}
