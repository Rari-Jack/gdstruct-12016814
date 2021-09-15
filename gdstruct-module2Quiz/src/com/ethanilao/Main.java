package com.ethanilao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player wanker = new Player(1, "Wanker", 100);
        Player mucho = new Player(2, "Mucho", 28);
        Player ess = new Player(3, "Ess", 45);
        Player omin = new Player(4, "Omin", 13);

        LinkedList linkedList = new LinkedList();

        linkedList.addToFront(wanker);
        linkedList.addToFront(mucho);
        linkedList.addToFront(omin);
        linkedList.addToFront(ess);

        // Linked List, line 15. Remove node by switching to the next node in the list
        linkedList.removeFirstNode();

        linkedList.printList();

        // Linked List, line 37. Using sir's display function, add the int size by one each time
        // a node has been detected.
        linkedList.getListSize();

        // Linked List, line 51.
        linkedList.contains(mucho);

        // Linked List, line 79.
        linkedList.indexOf(omin);

    }
}
