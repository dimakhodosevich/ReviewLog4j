package by.itstep.khodosevich.log4j.controller;

import by.itstep.khodosevich.log4j.module.FibonacciNumber;
import by.itstep.khodosevich.log4j.module.exception.NegativeNumberException;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    public static final Logger LOGGER = Logger.getRootLogger();

    public static Logger getLogger(){
        return LOGGER;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nInput number which you want to know fibonacci number: ");
            int number = scanner.nextInt();
            if (number==-1){
                Main.getLogger().debug("User input -1. Exit from program!!!");
                break;
            }

            try {
                Main.getLogger().debug("Program starts!!!");
                int result = FibonacciNumber.getFibonacciNumber(number);
                System.out.printf("\nFibonacci number of %d = %d", number, result);
            } catch (NegativeNumberException e) {
                Main.getLogger().error("Program catch exception:");
                Main.getLogger().error(e.getCause());
                Main.getLogger().error(e.getMessage());
            }

            Main.getLogger().debug("Program ends!!!");
        }

    }
}
