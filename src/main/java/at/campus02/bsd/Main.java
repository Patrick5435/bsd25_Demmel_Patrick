package at.campus02.bsd;

import at.campus02.bsd.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double number1 = 10;
        double number2 = 5;

        System.out.println("Addition: " + calculator.add(number1, number2));
        System.out.println("Subtraktion: " + calculator.subtract(number1, number2));
        System.out.println("Division: " + calculator.divide(number1, number2));
        System.out.println("Multiplikation: " + calculator.multiply(number1, number2));
        
        System.out.println("Patrick Demmel");
    }
}