import java.util.Scanner;

/**
 * Created by reevamerchant on 9/6/16.
 */
public class HelloWorld {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your name: ");
        String n = reader.nextLine(); // Scans the next token of the input as an int.
        System.out.println("Student Name: " + n);



            System.out.println("Enter your age: ");
            String b = reader.nextLine(); // Scans the next token of the input as an int.
            System.out.println("Student Age: " + b);





        System.out.println("Enter your email address: ");
        String c = reader.nextLine(); // Scans the next token of the input as an int.
        System.out.println("Student Email Address: " + c);
    }

}
