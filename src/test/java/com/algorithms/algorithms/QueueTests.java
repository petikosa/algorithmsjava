package com.algorithms.algorithms;

import com.algorithms.algorithms.basic.QueueStack;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class QueueTests {

    private QueueStack initStack() {
        QueueStack stack = new QueueStack();
        stack.push(4);
        stack.push(2);
        stack.push(6);
        return stack;
    }

    @Test
    void testPop() {
        // given
        QueueStack stack = initStack();

        // when
        int result = stack.pop();

        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    void testTop() {
        // given
        QueueStack stack = initStack();

        // when
        int result = stack.top();

        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    void testIfEmpty() {
        // given
        QueueStack stack = new QueueStack();

        // when
        stack.push(2);
        stack.pop();

        // then
        assertThat(stack.empty()).isTrue();
    }
}
