package dataTypes;

import java.util.Random;
import java.util.Scanner;

public class ArrayToBoolean {
    public int inputValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = in.nextInt();
        return n;
    }

    public void arrToBool(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2);
            System.out.print(arr[i] + " - ");

            if (arr[i] != 0)
                System.out.println("true,");
            else
                System.out.println("false,");

        }
    }
}

