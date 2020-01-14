package dataTypes;

import java.util.Random;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        double avg = 0;
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            sum += arr[i]; // сумма элементов
            System.out.println("Numbers " + arr[i]);
        }

        avg = (double) sum / n;
        System.out.println("Average = " + avg);
    }
}
