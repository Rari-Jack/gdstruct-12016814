package com.ethanilao;

public class SimpleHashtable {
    private StoredPlayer[] hashTable;

    public SimpleHashtable()
    {
        hashTable = new StoredPlayer[10];
    }

    private int hashKey(String key)
    {
        return key.length() % hashTable.length;
    }

    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey))
        {
            int stoppingIndex = hashedKey;

            if (hashedKey == hashTable.length - 1)
            {
                hashedKey = 0;
            }

            else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }

        if (hashTable[hashedKey] != null)
        {
            System.out.println("Sorry, this element has been taken in " + hashedKey);
        }

        else
        {
            hashTable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1)
        {
            return null;
        }

        return hashTable[hashedKey].value;
    }

    public void remove(String key)
    {
        int hashedKey = findKey(key);

        // Check if a slot has been occupied.
        if (isOccupied(hashedKey))
        {
            hashTable[hashedKey] = null;
        }

        else {
            System.out.println("No such element.");
        }
    }

    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }

        int stoppingIndex = hashedKey;

        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex
                && hashTable[hashedKey] != null
                && !hashTable[hashedKey].key.equals(key))
        {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if (hashTable[hashedKey] != null
                && hashTable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }

        return -1;

    }

    // Checks if a spot has been occupied via index check
    public boolean isOccupied(int index)
    {
        // Store occupied spot in a variable
        boolean isTaken = hashTable[index] != null;

        // Return occupied variable
        return isTaken;
    }

    public void printHashTable()
    {
        for (int i = 0; i < hashTable.length; i++)
        {
            if (hashTable[i] != null)
            {
                System.out.println("Element " + i + " " + hashTable[i].value);
            }

            else
            {
                System.out.println("Element " + i + " null");
            }

        }



    }
}
