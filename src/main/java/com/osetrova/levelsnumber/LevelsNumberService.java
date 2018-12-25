package com.osetrova.levelsnumber;

import com.osetrova.binarytree.BinaryTree;
import com.osetrova.nodesnumber.NodesNumberService;

public class LevelsNumberService {

    private static final int INCREASING_VALUE = 2;
    private NodesNumberService nodesNumberService = new NodesNumberService();

    public int getTreeLevelsNumber(BinaryTree tree) {
        int nodesNumber = nodesNumberService.getNodesNumber(tree);
        int level;

        if (nodesNumber == 0) {
            level = 0;
        } else if (nodesNumber == 1) {
            level = 1;
        } else {
            level = 1;
            double levelIncreasingValue = INCREASING_VALUE;
            while (nodesNumber / levelIncreasingValue >= 1) {
                levelIncreasingValue = Math.pow(INCREASING_VALUE, ++level);
            }
        }

        return level;
    }
}
