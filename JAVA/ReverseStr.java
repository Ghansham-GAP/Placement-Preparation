//Reverse a string entered by the user.
//(Concept: strings, loops)

package JAVA;

import java.util.Scanner;

public class ReverseStr {

    public static void main(String[] args) {

        System.out.print("Enter the string to reverse : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse of " + str + " is : " + rev);

        sc.close();
    }
}
