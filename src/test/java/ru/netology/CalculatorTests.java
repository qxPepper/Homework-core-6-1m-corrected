package ru.netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTests {
    Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void shouldMultiply_success() {
        System.out.println("Test N 1");
        int a = 8;
        int b = 4;
        int expected = 32;

        int result = calculator.multiply.apply(a, b);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldDivide_success() {
        System.out.println("Test N 2");
        int c = 8;
        int d = 0;

        Assertions.assertDoesNotThrow(() -> {calculator.devide.apply(c, d);});
    }

    @ParameterizedTest
    @ValueSource(ints = { 8, 5, 124, 1})
    public void shouldPositive_success(int argument) {
        System.out.println("Test N 3");

        Assertions.assertTrue(calculator.isPositive.test(argument));
    }
}

