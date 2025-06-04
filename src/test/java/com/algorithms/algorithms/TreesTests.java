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

    @Test
    void testMirroredTree() {
        // given
        Trees.Node node = new Trees.Node(1);
        node.left = new Trees.Node(3);
        node.right = new Trees.Node(2);
        node.right.right = new Trees.Node(5);
        node.left.left = new Trees.Node(8);

        Trees.Node mirrorNode = new Trees.Node(1);
        mirrorNode.left = new Trees.Node(2);
        mirrorNode.right = new Trees.Node(3);
        mirrorNode.right.right = new Trees.Node(8);
        mirrorNode.left.left = new Trees.Node(5);

        // when
        Trees.mirror(node);

        // then
        assertThat(Trees.isIdentical(node, mirrorNode)).isTrue();
    }

    @Test
    void testLowestCommonAncestor() {
        // given
        Trees.Node node = new Trees.Node(8);
        node.left = new Trees.Node(4);
        node.right = new Trees.Node(12);
        Trees.Node firstNode = new Trees.Node(14);
        Trees.Node secondNode = new Trees.Node(10);
        node.right.right = firstNode;
        node.right.left = secondNode;

        // when
        Trees.Node resultNode = Trees.lowestCommonAncestor(node, firstNode, secondNode);

        // then
        assertThat(resultNode.data).isEqualTo(12);
    }

    @Test
    void testLowestCommonAncestorHigherUp() {
        // given
        Trees.Node node = new Trees.Node(8);
        node.left = new Trees.Node(4);
        node.right = new Trees.Node(12);
        Trees.Node firstNode = new Trees.Node(14);
        Trees.Node secondNode = new Trees.Node(4);
        node.right.right = firstNode;
        node.right.left = secondNode;

        // when
        Trees.Node resultNode = Trees.lowestCommonAncestor(node, firstNode, secondNode);

        // then
        assertThat(resultNode.data).isEqualTo(8);
    }
}
