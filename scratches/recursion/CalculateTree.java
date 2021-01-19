package recursion;

import recursion.tree.Tree;

public class CalculateTree {
    public static void main(String[] args) {
        Tree tree = new Tree(0, new Tree(1, new Tree(3), new Tree(4)), new Tree(2, new Tree(5), new Tree(6)));
        System.out.println("recursive sum: " + tree.recursiveSum());
        System.out.println("iterative sum: " + tree.iterativeSum());
        System.out.println("find 1 value: " + tree.find(2));
    }
}
