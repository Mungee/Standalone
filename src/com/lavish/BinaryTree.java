package com.lavish;

public class BinaryTree {
    static Node root;

    public static void main(String[] args) {
        int[] unsorted = {3,5,2,1,6,8};
        makeBinaryTreeFromArray(unsorted);
    }

    private static void makeBinaryTreeFromArray(int[] unsorted) {
        root = new Node(unsorted[0]);
        int size = unsorted.length;
        for(int i=1;i<size;i++){
            insert(i, root);
        }
    }

    private static void insert(int i, Node root) {
        //if(i<root)
    }
}

class Node{
    Integer value;
    Node left;
    Node right;

    public Node(int i) {
        this.value = i;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
