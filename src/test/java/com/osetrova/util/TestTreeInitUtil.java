package com.osetrova.util;

import com.osetrova.binarytree.BinaryTree;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TestTreeInitUtil {

    public static BinaryTree<String> buildStringTree() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.add("Memory");
        testTree.add("Cat");
        testTree.add("Tree");
        testTree.add("Apple");
        testTree.add("Dog");
        testTree.add("Number");
        testTree.add("Window");
        testTree.add("Arrow");
        testTree.add("Daffodil");
        testTree.add("Leaf");
        testTree.add("Water");
        testTree.add("Yacht");
        testTree.add("Dragon");
        testTree.add("Library");

        return testTree;
    }

    public static BinaryTree<Integer> buildIntegerTree() {
        BinaryTree<Integer> testTree = new BinaryTree<>();
        testTree.add(8);
        testTree.add(3);
        testTree.add(10);
        testTree.add(1);
        testTree.add(6);
        testTree.add(14);
        testTree.add(4);
        testTree.add(7);
        testTree.add(13);

        return testTree;
    }
}
