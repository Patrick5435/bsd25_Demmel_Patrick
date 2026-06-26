package at.campus02.bsd;

import at.campus02.bsd.Calculator;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        double number1 = 10;
        double number2 = 5;

        System.out.println("Addition: " + calculator.add(number1, number2));
        System.out.println("Subtraktion: " + calculator.subtract(number1, number2));
        System.out.println("Division: " + calculator.divide(number1, number2));
        System.out.println("Multiplikation: " + calculator.multiply(number1, number2));
        
        System.out.println("Patrick Demmel");

        logger.info("Programm wurde gestartet");
        logger.error("Testfehler");
    }
}
