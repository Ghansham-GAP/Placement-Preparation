//Check if a number is prime or not.
//(Concept: conditionals, loops)

package JAVA;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        System.out.print("Enter the number to check if it is prime or not : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a Prime number!");
        } else {
            int count = 0;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(num + " is a Prime number!");
            } else {
                System.out.println(num + " is not a Prime number!");
            }
        }

        sc.close();

    }
}
