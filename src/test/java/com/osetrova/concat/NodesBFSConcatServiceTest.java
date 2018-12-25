package com.osetrova.concat;

import com.osetrova.binarytree.BinaryTree;
import com.osetrova.util.TestTreeInitUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodesBFSConcatServiceTest {

    private NodesBFSConcatService service = new NodesBFSConcatService();

    @Test
    public void checkConcatNodes() {
        BinaryTree<String> testTree = TestTreeInitUtil.buildStringTree();

        String expected = "MemoryCatTreeAppleDogNumberWindowArrowDaffodilLeafWaterYachtDragonLibrary";
        assertEquals(expected, service.concatNodes(testTree));
    }
}
