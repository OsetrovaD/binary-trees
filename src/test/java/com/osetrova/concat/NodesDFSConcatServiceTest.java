package com.osetrova.concat;

import com.osetrova.binarytree.BinaryTree;
import com.osetrova.util.TestTreeInitUtil;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodesDFSConcatServiceTest {

    private NodesDFSConcatService service = new NodesDFSConcatService();
    private static BinaryTree<String> testTree;

    @BeforeClass
    public static void initTree() {
        testTree = TestTreeInitUtil.buildStringTree();
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
