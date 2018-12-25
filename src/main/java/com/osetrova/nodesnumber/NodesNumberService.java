package com.osetrova.nodesnumber;

import com.osetrova.binarytree.BinaryTree;

public class NodesNumberService {

    public int getNodesNumber(BinaryTree tree) {
        return getNodesNumber(tree.getRoot());
    }

    private int getNodesNumber(BinaryTree.Node node) {
        int nodesNumber = 0;

        if (node != null) {
            nodesNumber += getNodesNumber(node.getLeftChild());
            nodesNumber++;
            nodesNumber += getNodesNumber(node.getRightChild());
        }
        return nodesNumber;
    }
}
