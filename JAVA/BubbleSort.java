//Sort an array of integers (you can use simple bubble sort).
//(Concept: arrays, loops)

package JAVA;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = 0; j < arrSize - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array : ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
