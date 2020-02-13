package phoneNumber;

public class Start {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Calculate calculate = new Calculate();

        int iterator = 0;
        String compareString = null;

        while (iterator <= 2) {
            iterator++;
            compareString = validator.inputValue();
            if (validator.validatorOfNumber(compareString)) {
                calculate.outputString(calculate.sumCharacter(calculate.calc(compareString, true)));
                break;
            } else {
                System.out.println("Неверный номер");
            }
        }
    }
}
