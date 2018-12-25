package com.osetrova.nodesnumber;

import com.osetrova.binarytree.BinaryTree;
import com.osetrova.util.TestTreeInitUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodesNumberServiceTest {

    private NodesNumberService service = new NodesNumberService();

    @Test
    public void checkGetNodesNumber() {
        BinaryTree<Integer> integerBinaryTree = TestTreeInitUtil.buildIntegerTree();

        int result = 9;
        assertEquals(result, service.getNodesNumber(integerBinaryTree));
    }
}
