
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number ");
        int number1 = Integer.parseInt(scanner.nextLine());
        if ( number1 < 0) {
            int  result = number1 * -1;
            System.out.println(result);
        } else {
            System.out.println(number1);
        }
    }
}
