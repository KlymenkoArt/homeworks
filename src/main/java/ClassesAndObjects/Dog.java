package ClassesAndObjects;

import static java.lang.String.valueOf;

public class Dog implements Animals {

    public String high(int h) {
        return String.valueOf(h);
    }

    String high(double h) {
        return String.valueOf(h);
    }

    public String weight(int w) {
        return String.valueOf(w);
    }

    String weight(double w) {
        return String.valueOf(w);
    }

    public String speed(int r) {
        return String.valueOf(r);
    }

    public String speed(double r) {
        return String.valueOf(r);
    }

    public void eat() {
        System.out.println("I`m Dog, and i eat fish!");
    }
}
