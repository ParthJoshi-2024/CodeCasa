import java.util.Scanner;
public class LibraryManagement{
    public static void main(String[] args) {
        
            char r;
        do{
            System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
            System.out.println("Press 1 to Add Book");
            System.out.println("Press 2 to Issue a Book");
            System.out.println("Press 3 to Return a Book");
            System.out.println("Press 4 to Print Complete Issue Details");
            System.out.println("Press 5 to Exit");
            System.out.println();
            Scanner obj3 = new Scanner(System.in);
            System.out.println("Enter any number");
            int a = obj3.nextInt();
            switch(a){
                case 1:
                Library aa = new Library();
                aa.add();
                break;

                case 2:
                Library bb = new Library();
                bb.issue();
                break;

                case 3:
                Library cc = new Library();
                cc.returning();
                break;

                case 4 :
                Library dd = new Library();
                dd.details();
                break;

                case 5 :
                Library ee = new Library();
                ee.exit();
                break;

                default:
                System.out.println("Invalid Option Selected");


            }
            System.out.println("You want to Select Next Option ? Yes / No");
            r = obj3.next().charAt(0);

        }
        while(r == 'y' || r == 'Y');
            if(r == 'n' || r == 'N'){
                Library z = new Library();
                z.exit();
                
            }

        
    } 
}

class Library{
    static String str, b, date;
    static int a,c;
    void add(){
        System.out.println("Enter Name of Book, Book Price, Book ID  - ");
        Scanner obj1 = new Scanner(System.in);
        String str = obj1.nextLine();
        float price = obj1.nextFloat();
        int bookid = obj1.nextInt();
        System.out.println("Your Details are : " + str + " " + price + " " + bookid);


    }

    void issue(){
        System.out.println("Welcome to the Book Issue Section");
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Book Name :: ");
        str = obj2.nextLine();
        System.out.println("Book ID :: ");
        a = obj2.nextInt();
        System.out.println("Book Issue Date :: ");
        b = obj2.next();
        System.out.println("Total Number of Books Issued :: ");
        c = obj2.nextInt();
        obj2.nextLine();
        System.out.println("Date of Returning the Book :: ");
        date = obj2.nextLine();
    }
    int get_id(){
        return a;
    }
    void returning(){
        System.out.println("Welcome to the Book Return Section");
        System.out.println("Enter Student Name and Book ID :: ");
        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int bookid = c.nextInt();
        if(a == bookid){
            // All Details should now be printed
            System.out.println("Complete Details :: ");
            System.out.println("Book Name :: " + Library.str);
            System.out.println("Book ID :: " + Library.a);
            System.out.println("Issuing Date :: " + Library.b);
            System.out.println("Total Number of Books Issued :: " + Library.c);
            System.out.println("Book Return Date :: " + Library.date);
        }
    else{
        System.out.println("Invalid ID !!!");
    }
 }
    void details(){
        System.out.println("Welcome to the Book Details Section ");
        System.out.println("Book Name :: " + Library.str);
        System.out.println("Book ID :: "+ Library.a);
        System.out.println("Issue Date :: " + Library.b);
        System.out.println("Total Number of Books Issued :: " + Library.c);
        System.out.println("Book Return Date :: " + Library.date);
    }
    void exit(){
        System.out.println("Finishing the Program");
        System.exit(0);
    }
}