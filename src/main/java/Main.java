import dataTypes.ArrayToString;
import dataTypes.ArrayToBoolean;
import dataTypes.ArrayPlusHello;
import dataTypes.Average;
import dataTypes.EvenOrOdd;
import dataTypes.Factorial;
import operators.HowMoney;
import operators.Cycles;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Select task!!!");
        System.out.println("Average: 1");
        System.out.println("EvenOrOdd: 2");
        System.out.println("Factorial: 3");
        System.out.println("ArrayToString: 4");
        System.out.println("ArrayPlusHello: 5");
        System.out.println("ArrayToBoolean: 6");
        System.out.println("HowMoney: 7");
        System.out.println("WhileCycle: 8");
        System.out.println("DoWhileCycle: 9");
        System.out.println("ForEachCycle: 10");
        final int callMethod = input.nextInt();
        switch (callMethod) {
            case 1:
                Average average = new Average();
                final int countOfElemetArray = average.value();
                average.outPoint(average.avrg(average.sumArr(countOfElemetArray), countOfElemetArray));
            case 2:
                EvenOrOdd evenOrOdd = new EvenOrOdd();
                evenOrOdd.calc(evenOrOdd.value());
            case 3:
                Factorial factr = new Factorial();
                factr.outPoint(factr.factorial(factr.value()));
            case 4:
                ArrayToString arrToStr = new ArrayToString();
                System.out.println("Enter '1' to run 'Array to String' or enter (2) to run 'String to Array'");
                final int runMethod = input.nextInt();
                switch (runMethod) {
                    case 1:
                        final int countOfElementArray = arrToStr.countElements();
                        System.out.println(arrToStr.convertArr(arrToStr.insertArr((countOfElementArray))));
                        break;
                    case 2:
                        System.out.println((arrToStr.reConvertArr()));
                        break;
                    default:
                        break;
                }
            case 5:
                ArrayPlusHello arrayPlusHello = new ArrayPlusHello();
                arrayPlusHello.arrPlusHello(arrayPlusHello.inputValue());
            case 6:
                ArrayToBoolean arrayToBoolean = new ArrayToBoolean();
                arrayToBoolean.arrToBool(arrayToBoolean.inputValue());
            case 7:
                HowMoney howMoney = new HowMoney();
                howMoney.decision();
            case 8:
                Cycles whileCycle = new Cycles();
                whileCycle.whileCycle();
            case 9:
                Cycles doWhile = new Cycles();
                doWhile.doWhileCycle();
            case 10:
                Cycles forEach = new Cycles();
                forEach.forEachCycle(forEach.insertArr());
            default:
                break;
        }
    }
}
