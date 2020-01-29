package operators;

import java.util.Random;
import java.util.Scanner;

public class Cycles {
    private Scanner in = new Scanner(System.in);

    public void whileCycle() {
        System.out.println("Enter your number:");
        int number = in.nextInt();

        while (number >= 10) {
            System.out.println(number);
            number--;
        }
    }

    public void doWhileCycle() {
        System.out.println("Enter your number:");
        int number = in.nextInt();

        do {
            System.out.println(number);
            number--;
        } while (number >= 10);
    }

    public int[] insertArr() {
        Random rand = new Random();
        int index = rand.nextInt(15);
        int[] arr = new int[index];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(7);
            System.out.print(arr[i] + ", ");
        }
        return arr;
    }

    public void forEachCycle(int[] arr) {
        System.out.println(" ");
        System.out.println("Your number: ");
        for (int i : arr) {
            if (i == 5)
                System.out.println(i);
        }
    }
}
