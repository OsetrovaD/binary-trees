package com.osetrova.concat;

import com.osetrova.binarytree.BinaryTree;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodesDFSConcatServiceTest {

    private NodesDFSConcatService service = new NodesDFSConcatService();
    private static BinaryTree<String> testTree = new BinaryTree<>();

    @BeforeClass
    public static void initTree() {
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
    }

    @Test
    public void checkInOrderConcat() {
        String expected = "AppleArrowCatDaffodilDogDragonLeafLibraryMemoryNumberTreeWaterWindowYacht";
        assertEquals(expected, service.inOrderConcat(testTree));
    }

    @Test
    public void checkPreOrderConcat() {
        String expected = "MemoryCatAppleArrowDogDaffodilLeafDragonLibraryTreeNumberWindowWaterYacht";
        assertEquals(expected, service.preOrderConcat(testTree));
    }

    @Test
    public void checkPostOrderConcat() {
        String expected = "ArrowAppleDaffodilDragonLibraryLeafDogCatNumberWaterYachtWindowTreeMemory";
        assertEquals(expected, service.postOrderConcat(testTree));
    }
}
