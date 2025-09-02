//Print a multiplication table of a number given by the user.
//(Concept: loops, input/output)

package JAVA;

import java.util.Scanner;

class MultTable {

    public static void main(String[] args) {

        System.out.print("Enter the number of which you want table printed : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int sum = num * i;
            System.out.println(sum);
        }

        sc.close();
    }
}