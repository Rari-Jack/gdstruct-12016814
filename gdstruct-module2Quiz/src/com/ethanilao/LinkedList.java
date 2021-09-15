package com.ethanilao;

public class LinkedList {
    private PlayerNode head;
    private int listSize;
    private boolean doesExist;
    private int index;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayerNode(head);
        head = playerNode;

    }

    public void removeFirstNode()
    {
        PlayerNode tempNode = head;
        head = head.nextPlayerNode;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayerNode();
        }

        System.out.println("null");
    }

    public void getListSize()
    {
        listSize = 0;

        PlayerNode current = head;
        while (current != null)
        {
            current = current.getNextPlayerNode();
            listSize++;
        }

        System.out.println(listSize);
    }

    public void contains(Player player)
    {
        PlayerNode current = head;

        if (player == null)
        {
            return;
        }

        while (current != null)
        {
            if (player == current.getPlayer())
            {
                doesExist = true;
                break;
            }

            else
            {
                doesExist = false;
            }

            current = current.getNextPlayerNode();
        }

        System.out.println(doesExist);
    }

    public void indexOf(Player player)
    {
        index = 0;

        for (PlayerNode current = head; head != null; current = current.getNextPlayerNode())
        {
            index++;

            if (player == current.getPlayer())
            {
                break;
            }
        }

        System.out.println("Element index: " + index);

    }
}
