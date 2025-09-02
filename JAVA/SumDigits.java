//Find the sum of digits of a number.
//(Concept: loops, arithmetic)

package JAVA;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits is : " + sum);

        sc.close();
    }
}
