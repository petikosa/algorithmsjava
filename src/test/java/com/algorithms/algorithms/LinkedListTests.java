package com.algorithms.algorithms;

import com.algorithms.algorithms.basic.LinkedList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LinkedListTests {

    @Test
    void reverseLinkedList() {
        // given
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);

        // when
        LinkedList.Node result = LinkedList.reverseList(head);

        // then
        assertThat(printLinkedList(result)).isEqualTo("4 3 2 1");
    }

    @Test
    void findCycles() {
        // given
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = head.next;

        // when
        boolean result = LinkedList.findCycle(head);
        boolean resultLoyd = LinkedList.findCycleFloyd(head);

        //then
        assertThat(result).isTrue();
        assertThat(resultLoyd).isTrue();
    }

    private String printLinkedList(LinkedList.Node head) {
        LinkedList.Node temp = head;
        StringBuilder s = new StringBuilder();
        while (temp != null) {
            s.append(temp.data).append(" ");
            temp = temp.next;
        }
        return s.toString().trim();
    }
}
