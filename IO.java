//to get input from user using the object of Scanner class.
//In order to use the object of Scanner, we need to import java.util.Scanner package.
// to create an object of the Scanner class. We can use the object to take input from the user.
import java.util.Scanner;

class IO{
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = s.nextInt();
        System.out.println("You entered " + number);

        // closing the scanner object
        s.close();
    }
}
