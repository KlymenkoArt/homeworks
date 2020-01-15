package dataTypes;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value:");
        int k = in.nextInt();
        System.out.println(factorial(k));
    }

    private static BigInteger factorial(int k) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
