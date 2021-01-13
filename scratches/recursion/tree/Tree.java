package recursion.tree;

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

    public int sum() {

        if (left != null) {
            s += left.sum();
        }
        if (right != null) {
            s += right.sum();
        }
        return value + s;
    }
}
