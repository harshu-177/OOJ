import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books() {}
    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        return "Book Name: " + name + "\n" +
               "Author Name: " + author + "\n" +
               "Price: " + price + "\n" +
               "Number of Pages: " + numPages + "\n";
    } 
}

class BRun{
    public static void main(String[] args) {
        System.out.println("NAME: HARSHITH B");
        System.out.println("USN: 2023BMS02519\n");

        Scanner sc = new Scanner(System.in);
        int n;
        String name, author;
        int price, numPages;

        System.out.print("Enter the number of books: ");
        n = sc.nextInt();
        sc.nextLine();

        Books[] b = new Books[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Books " + (i + 1) + ": ");
            System.out.print("Enter name of the book: ");
            name = sc.nextLine();
            System.out.print("Enter Author: ");
            author = sc.nextLine();
            System.out.print("Enter price: ");
            price = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter number of pages: ");
            numPages = sc.nextInt();
            sc.nextLine();
            b[i] = new Books(name, author, price, numPages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Book: " + (i + 1) + "\n" + b[i]);
        }

        sc.close();
    }
}
