//Find the largest and smallest element in an array.
//(Concept: arrays, loops)

package JAVA;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arrsize = sc.nextInt();

        int arr[] = new int[arrsize];

        System.out.println("Insert array elements : ");
        for (int i = 0; i < arrsize; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arrsize; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element is : " + largest);
        System.out.println("Smallest element is : " + smallest);

        sc.close();
    }
}
