package by.itstep.khodosevich.log4j.module;

import by.itstep.khodosevich.log4j.module.exception.NegativeNumberException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {

    @Test
    public void getFibonacciNumber_positive_with_zero() throws NegativeNumberException {
        int actual = 0;
        int expected = 0;
        int result = FibonacciNumber.getFibonacciNumber(actual);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void getFibonacciNumber_positive_with_one() throws NegativeNumberException {
        int actual = 1;
        int expected = 1;
        int result = FibonacciNumber.getFibonacciNumber(actual);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void getFibonacciNumber_positive_with_two() throws NegativeNumberException {
        int actual = 2;
        int expected = 1;
        int result = FibonacciNumber.getFibonacciNumber(actual);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void getFibonacciNumber_positive_with_five() throws NegativeNumberException {
        int actual = 5;
        int expected = 5;
        int result = FibonacciNumber.getFibonacciNumber(actual);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void getFibonacciNumber_positive_with_nine() throws NegativeNumberException {
        int actual = 9;
        int expected = 34;
        int result = FibonacciNumber.getFibonacciNumber(actual);

        Assert.assertEquals(expected, result);
    }




}