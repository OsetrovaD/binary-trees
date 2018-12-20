package com.osetrova.nodesnumber;

import com.osetrova.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodesNumberServiceTest {

    private NodesNumberService service = new NodesNumberService();

    @Test
    public void checkGetNodesNumber() {
        BinaryTree<Integer> integerBinaryTree = new BinaryTree<>();
        integerBinaryTree.add(8);
        integerBinaryTree.add(3);
        integerBinaryTree.add(10);
        integerBinaryTree.add(1);
        integerBinaryTree.add(6);
        integerBinaryTree.add(14);
        integerBinaryTree.add(4);
        integerBinaryTree.add(7);
        integerBinaryTree.add(13);

        int result = 9;
        assertEquals(result, service.getNodesNumber(integerBinaryTree));
    }
}
