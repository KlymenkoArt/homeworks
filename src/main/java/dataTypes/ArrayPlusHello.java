package dataTypes;

import java.util.Random;
import java.util.Scanner;

public class ArrayPlusHello {
    public int inputValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = in.nextInt();
        return n;
    }

    public void ArrPlusHello(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + "Hello ");
        }
    }
}
