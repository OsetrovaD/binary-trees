package com.osetrova.levelsnumber;

import com.osetrova.binarytree.BinaryTree;
import com.osetrova.util.TestTreeInitUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LevelsNumberServiceTest {

    private LevelsNumberService service = new LevelsNumberService();

    @Test
    public void checkGetTreeLevelsNumber() {
        BinaryTree<Integer> integerBinaryTree = TestTreeInitUtil.buildIntegerTree();

        int expectedLevelsNumber = 4;
        int treeLevelsNumber = service.getTreeLevelsNumber(integerBinaryTree);
        assertEquals(expectedLevelsNumber, treeLevelsNumber);
    }
}
