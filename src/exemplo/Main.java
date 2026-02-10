package exemplo;

public class Main {
    public static void main(String[] args) {

        double number1 = 20.5;
        double number2 = 40.6;

        if (number1 > number2) {
            System.out.println("The number " + number1 + " is greater than the number " + number2);
        }

        else if (number1 == number2) {
            System.out.println("The number " + number1 + " is equal to the number " + number2);
        }

        else {
            System.out.println("The number " + number1 + " is less than the number " + number2);
        }
    }
}

