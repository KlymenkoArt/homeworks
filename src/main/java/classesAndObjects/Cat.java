package classesAndObjects;

public class Cat implements Animals {

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

    String speed(double r) {
        return String.valueOf(r);
    }

    public void eat() {
        System.out.println("I`m Cat, and i eat meat");
    }
}
