package com.algorithms.algorithms;

import com.algorithms.algorithms.basic.Trees;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TreesTests {

    @Test
    void testTreeDepth() {
        // given
        Trees.Node node = new Trees.Node(1);
        node.left = new Trees.Node(3);
        node.right = new Trees.Node(2);
        node.right.right = new Trees.Node(5);
        node.left.left = new Trees.Node(8);

        // when
        int depth = Trees.findDepth(node);

        // then
        assertThat(depth).isEqualTo(3);
    }
}
