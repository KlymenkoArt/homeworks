package dataTypes;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value:");
        int k = in.nextInt();
        if (k != 0) {
            if (k % 2 != 0)
                System.out.println("This number is odd");
            else
                System.out.println("This number is even");
        }
        else
            System.out.println("This number is '0'");
    }
}
