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


    public String[] reConvertArr() {
        System.out.println("Enter your String:");
        String str = in.next();
        String[] arrStr = new String[str.length()];
        for (int i = 0, j = 0; i < arrStr.length && j < str.length(); i++, j++) {
            arrStr[i] = String.valueOf(str.charAt(j));
        }
        return arrStr;
    }

    public char [] reConv() {
        System.out.print("Enter your String: ");
        String str = in.nextLine();
        char [] arrStr = str.toCharArray();
        return arrStr;
    }

    public void outArr(String [] arrStr){
        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i] + ", ");
        }
    }
}
