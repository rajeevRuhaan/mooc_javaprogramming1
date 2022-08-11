
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = firstNumber + secondNumber;
        double squareRoot = (Math.sqrt(sum));
        System.out.println(squareRoot);
    }
}
