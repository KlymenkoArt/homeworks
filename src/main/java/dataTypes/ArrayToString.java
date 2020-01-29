package dataTypes;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {
    private Scanner in = new Scanner(System.in);

    public int countElements() {
        System.out.println("Enter number of array elements:");
        return in.nextInt();
    }

    public Object[] insertArr(int n) {
        Object[] arr = new Object[n];
        System.out.println("Enter symbols for array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        return arr;
    }

    public Object[] convertArr(Object[] arr) {
        System.out.println("This string is:" + Arrays.toString(arr));
        return arr;
    }

    public char[] reConvertArr() {
        System.out.print("Enter your String: ");
        String str = in.nextLine();
        char[] arrStr = str.toCharArray();
        return arrStr;
    }
}
