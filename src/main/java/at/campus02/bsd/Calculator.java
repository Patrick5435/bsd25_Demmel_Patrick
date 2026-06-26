package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2) {
        logger.debug("add aufgerufen: number1={}, number2={}", number1, number2);
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        logger.debug("subtract aufgerufen: number1={}, number2={}", number1, number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        logger.debug("divide aufgerufen: number1={}, number2={}", number1, number2);
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("multiply aufgerufen: number1={}, number2={}", number1, number2);
        return number1 * number2;
    }
}
