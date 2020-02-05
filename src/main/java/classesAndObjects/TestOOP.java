package classesAndObjects;

public class TestOOP {
    public static void main(String[] args) {
        Cat  cat = new Cat();
        cat.eat();
        System.out.println("hight in int: " + cat.high(20) + ", hight in double: " + cat.high(24.64));
        System.out.println("weight in int: " + cat.weight(2) + ", weight in double: " + cat.weight(2.08));
        System.out.println("weight in int: " + cat.speed(35) + ", weight in double: " + cat.speed(35.16));


        Dog dog = new Dog();
        dog.eat();
        System.out.println("hight in int: " + dog.high(31) + ", hight in double: " + dog.high(31.14));
        System.out.println("weight in int: " + dog.weight(3) + ", weight in double: " + dog.weight(3.04));
        System.out.println("weight in int: " + dog.speed(31) + ", weight in double: " + dog.speed(31.12));
    }
}
