package dataTypes;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public int value() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value:");
        int k = in.nextInt();
        System.out.println(factorial(k));
        return k;
    }

    public BigInteger factorial(int k) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public void outPoint(BigInteger res){
        System.out.println("Factorial = " + res);
    }
}
