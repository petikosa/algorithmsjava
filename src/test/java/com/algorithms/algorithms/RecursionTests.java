package com.algorithms.algorithms;

import com.algorithms.algorithms.basic.Recursion;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RecursionTests {

    @Test
    void recursiveFibonacci() {
        // given
        int n = 6;

        // when
        int result = Recursion.fibr(n);

        // then
        assertThat(result).isEqualTo(8);
    }


    @Test
    void recursiveFibonacciHighNumber() {
        // given
        int n = 10;

        // when
        int result = Recursion.fibr(n);

        // then
        assertThat(result).isEqualTo(55);
    }

    @Test
    void loopFibonacci() {
        // given
        int n = 6;

        // when
        int result = Recursion.fib(n);

        // then
        assertThat(result).isEqualTo(8);
    }


    @Test
    void loopFibonacciHighNumber() {
        // given
        int n = 10;

        // when
        int result = Recursion.fib(n);

        // then
        assertThat(result).isEqualTo(55);
    }

    @Test
    void recursiveFibonacciZero() {
        // given
        int n = 0;

        // when
        int result = Recursion.fibr(n);

        // then
        assertThat(result).isEqualTo(0);
    }


    @Test
    void recursiveFibonacciOne() {
        // given
        int n = 1;

        // when
        int result = Recursion.fib(n);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void loopFibonacciZero() {
        // given
        int n = 0;

        // when
        int result = Recursion.fib(n);

        // then
        assertThat(result).isEqualTo(0);
    }


    @Test
    void loopFibonacciOne() {
        // given
        int n = 1;

        // when
        int result = Recursion.fib(n);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void parenthesesAreValid() {
        // given
        String p = "[{()}]";

        // when
        boolean result = Recursion.validParentheses(p);

        // then
        assertThat(result).isTrue();
    }

    @Test
    void parenthesesAreNotValid() {
        // given
        String p = "[{()}";

        // when
        boolean result = Recursion.validParentheses(p);

        // then
        assertThat(result).isFalse();
    }
}
