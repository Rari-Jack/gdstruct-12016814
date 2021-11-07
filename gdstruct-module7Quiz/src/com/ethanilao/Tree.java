package com.ethanilao;

public class Tree {
    static Node root;

    public Node insert(Node node, int value)
    {
        if (node == null)
        {
            return (new Node(value));
        }

        else {
            if (value <= node.data)
            {
                node.leftChild = insert(node.leftChild, value);
            }

            else {
                node.rightChild = insert(node.rightChild, value);
            }

            return node;
        }
    }

    public void traverseInOrder(Node node)
    {
        Node current = node;
        if (node != null)
        {
            traverseInOrder(current.rightChild);
            System.out.println(current.data);
            traverseInOrder(current.leftChild);
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public int getMin(Node node)
    {
        Node current = node;

        while (current.leftChild != null)
        {
            current = current.leftChild;
        }

        return (current.data);
    }

    public int getMax(Node node)
    {
        Node current = node;

        while (current.rightChild != null)
        {
            current = current.rightChild;
        }

        return (current.data);
    }
}
