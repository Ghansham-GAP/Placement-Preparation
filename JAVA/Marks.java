package JAVA;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("Enter subjectwise marks out of 100 : ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Maths : ");
        byte s1 = sc.nextByte();
        System.out.print("Science : ");
        byte s2 = sc.nextByte();
        System.out.print("English : ");
        byte s3 = sc.nextByte();
        System.out.print("Hindi : ");
        byte s4 = sc.nextByte();
        System.out.print("Marathi : ");
        byte s5 = sc.nextByte();

        int total = s1 + s2 + s3 + s4 + s5;
        double percnt = (total / 500.0) * 100;

        System.out.println("Percentage : " + percnt + "%");

        sc.close();

    }
}
