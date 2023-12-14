package Data;

import java.util.Scanner;

public class Digit {
    private double a;

    public Digit(String a) {
        try {
            this.a = Double.parseDouble(a);
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные, попробуйте еще раз.");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
