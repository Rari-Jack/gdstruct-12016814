package com.ethanilao;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Instantiate players
        Player ram = new Player("Ram");
        Player pot = new Player("Potemkin");
        Player ky = new Player("Ky Kiske");
        Player sol = new Player("Sol Badguy");
        Player axl = new Player("Axl Low");

        // Instantiate hashtable
        SimpleHashtable hashtable = new SimpleHashtable();

        // Insert hash values
        hashtable.put(ram.getmName(), ram);
        hashtable.put(pot.getmName(), pot);
        hashtable.put(ky.getmName(), ky);
        hashtable.put(sol.getmName(), sol);
        hashtable.put(axl.getmName(), axl);

        // Print hashtable before removing
        System.out.println("\nBefore removing: ");
        hashtable.printHashTable();

        // Removing an element (SimpleHashTable, line 62)
        hashtable.remove(axl.getmName());

        // Print hashTable after removing
        System.out.println("\nAfter removing: ");
        hashtable.printHashTable();
    }
}
