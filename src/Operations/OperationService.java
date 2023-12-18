package Operations;

import Data.Digit;
import View.ViewAddition;
import View.ViewDivision;
import View.ViewMultiplication;
import View.ViewSubtraction;

import java.util.Scanner;

public class OperationService {
    Scanner scanner = new Scanner(System.in);
    private Operation operation;
    private Digit digit;
    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
    public void inputFromConsole() {
        String a1 = prompt("Введите первое число: ");
        Digit firstDigit = new Digit(a1);
        String b2 = prompt("Введите второе число: ");
        Digit secondDigit = new Digit(b2);
        String arithmetic = prompt("Введите необходимое арифметическое действие " +
                "над числами: +, -, * или /");
        double result;
        if (arithmetic.equals("-")) {
            Operation operation1 = new Subtraction();
            result = operation1.getResult(firstDigit.getA(), secondDigit.getA());
            ViewSubtraction viewSubtraction = new ViewSubtraction();
            viewSubtraction.printOnConsole(result);
        }
        if (arithmetic.equals("*")){
            Operation operation2 = new Multiplication();
            result = operation2.getResult(firstDigit.getA(), secondDigit.getA());
            ViewMultiplication viewMultiplication = new ViewMultiplication();
            viewMultiplication.printOnConsole(result);
        }
        if (arithmetic.equals("/")){
            Operation operation3 = new Division();
            result = operation3.getResult(firstDigit.getA(), secondDigit.getA());
            ViewDivision viewDivision = new ViewDivision();
            viewDivision.printOnConsole(result);
        }
        if (arithmetic.equals("+")){
            Operation operation4 = new Addition();
            result = operation4.getResult(firstDigit.getA(), secondDigit.getA());
            ViewAddition viewAddition = new ViewAddition();
            viewAddition.printOnConsole(result);
        }
        else System.out.println("\n***\n");

    }

}
