package JAVA;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("Enter any number : ");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i == 0) {
            System.out.println("Zero is neighter even nor odd");
        } else if (i % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
