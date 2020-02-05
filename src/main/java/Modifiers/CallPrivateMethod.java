package Modifiers;

public class CallPrivateMethod {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.high(178);
        methods.say("Hello!");
        Methods.sleep();
    }
}
