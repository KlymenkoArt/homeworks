package ClassesAndObjects;

public class Test {
    public Test() {
        getNameOfClass("Hello ");
    }

    public Test(String strng) {
        getNameOfClass(strng);
    }

    private void getNameOfClass(String str) {
        String nameClass = Test.class.getSimpleName();
        System.out.println(str + nameClass);
    }
}
