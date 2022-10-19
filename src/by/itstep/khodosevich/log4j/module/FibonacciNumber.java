package by.itstep.khodosevich.log4j.module;

import by.itstep.khodosevich.log4j.controller.Main;
import by.itstep.khodosevich.log4j.module.exception.NegativeNumberException;

import static by.itstep.khodosevich.log4j.controller.Main.LOGGER;

public class FibonacciNumber {
    public static int getFibonacciNumber(int number) throws NegativeNumberException {
        LOGGER.trace("Method starts work.");
        if(number<0){
            LOGGER.trace("Method catch exception.");
            throw new NegativeNumberException("Negative number exception");
        }

        int firstNumber = 0;
        int secondNumber = 1;

        if(number==0){
            LOGGER.trace("Method return 0.");
            return firstNumber;
        } else if(number ==1){
            LOGGER.trace("Method return 1.");
            return secondNumber;
        }

        int fibonacciNumber = firstNumber+secondNumber;
        LOGGER.trace("Method loop starts.");
        for (int i = 2; i < number; i++) {
            firstNumber = secondNumber;
            secondNumber = fibonacciNumber;
            fibonacciNumber = firstNumber+secondNumber;
        }
        LOGGER.trace("Method loop ends.");

        LOGGER.trace("Method return " + fibonacciNumber + ".");

        return fibonacciNumber;
    }
}
