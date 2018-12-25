package com.osetrova.concat;

import com.osetrova.binarytree.BinaryTree;

public class NodesDFSConcatService {

    public String inOrderConcat(BinaryTree tree) {
        return inOrderConcat(tree.getRoot());
    }

    public String preOrderConcat(BinaryTree tree) {
        return preOrderConcat(tree.getRoot());
    }

    public String postOrderConcat(BinaryTree tree) {
        return postOrderConcat(tree.getRoot());
    }

    private String inOrderConcat(BinaryTree.Node node) {
        StringBuilder result = new StringBuilder();

        if (node != null) {
            result.append(inOrderConcat(node.getLeftChild()));
            result.append(node.getKey());
            result.append(inOrderConcat(node.getRightChild()));
        }

        return result.toString();
    }

    private String preOrderConcat(BinaryTree.Node node) {
        StringBuilder result = new StringBuilder();

        if (node != null) {
            result.append(node.getKey());
            result.append(preOrderConcat(node.getLeftChild()));
            result.append(preOrderConcat(node.getRightChild()));
        }

        return result.toString();
    }

    private String postOrderConcat(BinaryTree.Node node) {
        StringBuilder result = new StringBuilder();

        if (node != null) {
            result.append(postOrderConcat(node.getLeftChild()));
            result.append(postOrderConcat(node.getRightChild()));
            result.append(node.getKey());
        }

        return result.toString();
    }
}
