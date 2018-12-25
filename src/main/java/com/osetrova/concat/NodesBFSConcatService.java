package com.osetrova.concat;

import com.osetrova.binarytree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class NodesBFSConcatService {

    public String concatNodes(BinaryTree tree) {
        return concatNodes(tree.getRoot());
    }

    private String concatNodes(BinaryTree.Node node) {
        StringBuilder result = new StringBuilder();

        if (node != null) {
            Queue<BinaryTree.Node> nodes = new LinkedList<>();
            nodes.add(node);

            while (!nodes.isEmpty()) {
                BinaryTree.Node currentNode = nodes.poll();
                result.append(currentNode.getKey());

                if (currentNode.getLeftChild() != null) {
                    nodes.add(currentNode.getLeftChild());
                }

                if (currentNode.getRightChild() != null) {
                    nodes.add(currentNode.getRightChild());
                }
            }
        }

        return result.toString();
    }
}
