package operators;

import java.util.Scanner;

public class HowMoney {

    public void decision () {
        System.out.println("How much money do you have?");
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        System.out.println("What time is it?");
        int time = in.nextInt();

        if (time >= 8 && time <12 && money >= 10 && money <50)
            System.out.println("Идем в магазин");
        else if (time >= 12 && money >= 50)
            System.out.println("Идем в кафе");
        else if (time > 12 && time < 19 && money < 50)
            System.out.println("Идем к соседу");
        else if (time >=19 && time <22)
            System.out.println("Смотрим телевизор");
        else if (time >= 22)
            System.out.println("Идем спать");
        else
            System.out.println("Условие не покрывает данный вариант");

        }

}
