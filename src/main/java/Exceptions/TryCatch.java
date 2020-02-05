package Exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Try/Catch - Enter (1);");
        System.out.println("Try/Finally - Enter (2);");
        System.out.println("Try/Catch [IOExceptions] - Enter (3);");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        switch (value) {
            case 1:
                try {
                    int k = 1 / 0;
                    System.out.println(k);
                } catch (ArithmeticException exp) {
                    System.out.println("Error: cannot be divided by zero");
                }
                break;
            case 2:

                try {
                    int arr[] = {23, 16, 15};
                    System.out.println(arr[2]);
                } finally {
                    System.out.println("Enter correct value");
                }
                break;
            case 3:
                try {
                    FileReader read = new FileReader("notes3.txt");
                    String str = read.toString();
                    System.out.println(str);
                } catch (IOException ex) {
                    System.out.println("Error: " + ex);
                }
                break;
        }
    }
}
