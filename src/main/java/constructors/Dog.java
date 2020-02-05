package constructors;

public class Dog {

    Dog () {
        System.out.println("Gav!");
    }
    Dog (String str, Integer age) {
        System.out.println("My Name is: " + str);
        System.out.println("I am " + age + " years old");
    }
    Dog (String str, Integer age, Double high){
        System.out.println("My Name is: " + str);
        System.out.println("I am " + age + " years old");
        System.out.println("my height is: " + high);
    }
}
