package com.ethanilao;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tree tree = new Tree();
        Node root = null;

        root = tree.insert(root, 2);

        tree.insert(root, 5);
        tree.insert(root, 39);
        tree.insert(root, -8);

        // Get minimum value
        System.out.println("Minimum value: " + tree.getMin(root));

        // Get maximum value
        System.out.println("Maximum value: " + tree.getMax(root));

        // Display list in descending order
        System.out.println("\nDescending Order: ");

        tree.traverseInOrder(root);



    }
}
