package com.osetrova.concat;

import com.osetrova.binarytree.BinaryTree;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodesBFSConcatServiceTest {

    private NodesBFSConcatService service = new NodesBFSConcatService();
    private static BinaryTree<String> BFSTestTree = new BinaryTree<>();

    @BeforeClass
    public static void initTree() {
        BFSTestTree.add("Memory");
        BFSTestTree.add("Cat");
        BFSTestTree.add("Tree");
        BFSTestTree.add("Apple");
        BFSTestTree.add("Dog");
        BFSTestTree.add("Number");
        BFSTestTree.add("Window");
        BFSTestTree.add("Arrow");
        BFSTestTree.add("Daffodil");
        BFSTestTree.add("Leaf");
        BFSTestTree.add("Water");
        BFSTestTree.add("Yacht");
        BFSTestTree.add("Dragon");
        BFSTestTree.add("Library");
    }

    @Test
    public void checkConcatNodes() {
        String expected = "MemoryCatTreeAppleDogNumberWindowArrowDaffodilLeafWaterYachtDragonLibrary";
        assertEquals(expected, service.concatNodes(BFSTestTree));
    }
}
