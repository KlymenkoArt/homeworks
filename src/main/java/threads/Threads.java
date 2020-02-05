package threads;

import java.util.Random;

public class Threads extends Thread {
    private Random rand = new Random();
    private int[] arr = new int[12];

    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
            System.out.print( arr[i] + ", ");
        }
        System.out.println();
    }
}
