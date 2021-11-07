package com.ethanilao;

public class Node {
    public int data;
    public Node rightChild;
    public Node leftChild;

    public Node insert(Node node, int value)
    {
        if (value == data) // Ignores duplicate data
        {
            return (new Node(value));
        }

        if (value < data)
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }

            else {
                leftChild.insert(node, value);
            }
        }

        else
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }

            else {
                rightChild.insert(node, value);
            }
        }

        return node;
    }

    public void traverseInOrder()
    {
        if (leftChild != null)
        {
            leftChild.traverseInOrder();
        }

        System.out.println("Data " + data);

        if (rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }

        if (value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }

        else
        {
            if (rightChild != null)
            {
                return rightChild.get(value);
            }
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

    public Node(int _data)
    {
        this.data = _data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
