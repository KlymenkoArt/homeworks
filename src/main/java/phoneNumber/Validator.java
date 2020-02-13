package phoneNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {
    String inputValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона:");
        return scanner.nextLine();
    }

    boolean validatorOfNumber(String number) {
        String regex = "(^(0|\\+380)?\\d{9})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

}