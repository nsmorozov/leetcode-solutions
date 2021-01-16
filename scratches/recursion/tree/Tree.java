package recursion.tree;

import recursion.datastructure.SimpleStack;

public class Tree {
    private int value;
    private Tree left;
    private Tree right;
    private int s;

    public Tree(int value, Tree left, Tree righ) {
        this.value = value;
        this.left = left;
        this.right = righ;
    }

    public Tree(int value) {
        this.value = value;
    }

    public int recursiveSum() {
        if (left != null) {
            s += left.recursiveSum();
        }
        if (right != null) {
            s += right.recursiveSum();
        }
        return value + s;
    }

    public int iterativeSum() {
        SimpleStack<Tree> stack = new SimpleStack<>();
        int s = value;
        stack.push(this);
        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            if (node.left != null) {
                s += node.left.value;
                stack.push(node.left);
            }
            if (node.right != null) {
                s += node.right.value;
                stack.push(node.right);
            }
        }
        return s;
    }
}
