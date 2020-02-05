package Modifiers;

public class Methods {
    public void say(String str) {
        System.out.println("You say: " + str);
    }

    private void run() {
        System.out.println("I'm running!");
    }

    protected void age(int a) {
        System.out.println("I am " + a + "years old");
    }

    void high (int h) {
        System.out.println("my high is " + h);
    }

    static void sleep (){
        System.out.println("I`m sleeping");
    }
}
