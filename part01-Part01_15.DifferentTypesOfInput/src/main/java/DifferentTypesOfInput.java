
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String value1= scan.nextLine();
        System.out.println("Give an integer:");
        int value2= Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double value3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean value4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + value1);
        System.out.println("You gave the integer " + value2);
        System.out.println("You gave the double " + value3);
        System.out.println("You gave the boolean " + value4);


        // Write your program here

    }
}
