package phoneNumber;

import java.lang.*;
import java.util.HashMap;
import java.util.Map;

class Calculate {

    int calc(String number, boolean res) {
        char[] arrNumber = number.toCharArray();
        int sum = 0;
        if (res) {
            for (int i = 1; i <= arrNumber.length; i++) {
                sum += Integer.parseInt(String.valueOf(arrNumber[i]));
            }
            System.out.println("Сумма элементов: " + sum);
        } else {
            System.out.println("Введен неверный номер!");
        }
        return sum;
    }

    int sumCharacter(int sum) {
        int val = sum;
        System.out.println("Расчет");
        System.out.println("Итерация 0: " + val);
        int iteration = 1;

        while (val >= 10) {
            int right = (val % 10);
            int left = (val / 10);
            val = left + right;
            System.out.println("итерация " + iteration + ": " + left + "+" + right + " = " + val);
            iteration++;
        }
        System.out.println("Результат: " + val);
        return val;
    }

    void outputString(int val) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Один");
        hashMap.put(2, "Два");
        hashMap.put(3, "Три");
        hashMap.put(4, "Четыре");
        hashMap.put(5, "Пять");
        hashMap.put(6, "Шесть");
        hashMap.put(7, "Семь");
        hashMap.put(8, "Восемь");
        hashMap.put(9, "Девять");
        System.out.println(hashMap.get(val));
    }
}