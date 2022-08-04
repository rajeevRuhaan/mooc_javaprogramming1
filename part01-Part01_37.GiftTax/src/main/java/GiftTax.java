
import java.util.Scanner;

import javax.management.ValueExp;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        if (giftValue < 5000 ){
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            Double tax = (100 + (giftValue - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        }   else if (giftValue >= 25000 && giftValue < 55000) {
            Double tax = (1700 + (giftValue - 25000) * 0.1);
            System.out.println("Tax: " + tax);
        }   else if (giftValue >= 55000 && giftValue < 200000) {
            Double tax = (4700 + (giftValue - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        }   else if (giftValue >= 200000 && giftValue < 1000000) {
            Double tax = (22100 + (giftValue - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        }   else {
            Double tax = (142100 + (giftValue - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }

    }
}
