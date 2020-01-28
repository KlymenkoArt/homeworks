package dataTypes;

import java.util.Scanner;

public class EvenOrOdd {
    public int value() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value:");
        return in.nextInt();
    }

        public void calc (int k){
        if (k != 0) {
            if (k % 2 != 0)
                System.out.println("This number is odd");
            else
                System.out.println("This number is even");
        } else
            System.out.println("This number is '0'");
    }
}