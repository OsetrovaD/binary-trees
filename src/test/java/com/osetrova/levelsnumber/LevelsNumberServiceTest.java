package com.osetrova.levelsnumber;

import com.osetrova.binarytree.BinaryTree;
import org.junit.Test;

public class LevelsNumberServiceTest {

    private LevelsNumberService service = new LevelsNumberService();

    @Test
    public void checkGetTreeLevelsNumber() {
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

        int treeLevelsNumber = service.getTreeLevelsNumber(integerBinaryTree);
        System.out.println(treeLevelsNumber);
    }
}
