package JAVA;

import java.util.*;

public class Addition {
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers to add : ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Addition of " + num1 + " and " + num2 + " is : " + sum);

        sc.close();
    }
}
