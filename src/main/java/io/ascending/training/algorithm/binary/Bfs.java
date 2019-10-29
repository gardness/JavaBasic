package io.ascending.training.algorithm.binary;

import io.ascending.training.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
        public void BFS(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            if (root == null) {
                return;
            }
            queue.offer(root);
            while (!queue.isEmpty()) {
                int temp  = queue.size();

                for (int i = 0; i < temp; i++) {
                    TreeNode node = queue.poll();
                    System.out.println(node.val);

                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
        }

//    public void BFS(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//
//        Queue<TreeNode> q = new LinkedList<>();
//
//        q.offer(root);
//        int size = q.size();
//
//        while (size-- != 0) {
//            TreeNode tmp = q.poll();
//            System.out.println(tmp.val);
//
//            if (tmp.left != null) {
//                q.offer(tmp.left);
//                size++;
//            }
//
//            if (tmp.right != null) {
//                q.offer(tmp.right);
//                size++;
//            }
//        }
//
//        return;
//    }

    public static void main(String[] arg) {
        Bfs queueSolution = new Bfs();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(8);
        right.left = new TreeNode(7);
        right.right = new TreeNode(9);
        queueSolution.BFS(root);
    }


}
