package recursion;

import recursion.tree.Tree;

public class FillTree {
    public static void main(String[] args) {
        Tree tree = new Tree(0, new Tree(1, new Tree(3), new Tree(4)), new Tree(2, new Tree(5), new Tree(6)));
        System.out.println(tree.sum());
    }
}
