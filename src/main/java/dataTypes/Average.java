package dataTypes;

import java.util.Random;
import java.util.Scanner;

public class Average {

    public int value() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        return in.nextInt();
    }

    public int sumArr(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            sum += arr[i];
            System.out.println("Numbers " + arr[i]);
        }
        return sum;
    }

    public double avrg(int sum, int val) {
        double avg;
        avg = (double) sum / val;
        return avg;
    }

    public void outPoint(double avg){
        System.out.println("Average = " + avg);
    }
}
