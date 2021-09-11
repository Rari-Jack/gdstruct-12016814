package com.ethanilao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[]{30, 19, 2, 69, 432};

        System.out.println("Before bubble sort: ");

        printArrayElements(intArray);

        bubbleSort(intArray);

        System.out.println("\nAfter bubble sort: ");

        printArrayElements(intArray);

        int[] intNumbers = new int[]{190, 2, 469, 300, 1290};

        System.out.println("\nBefore selection sort: ");

        printArrayElements(intNumbers);

        selectionSort(intNumbers);

        System.out.println("\nAfter selection sort: ");

        printArrayElements(intNumbers);

        int[] modifiedNumbers = new int[]{20, 182, 2942, 4, 304};

        System.out.println("\nBefore modified selection sort: ");

        printArrayElements(modifiedNumbers);

        modifiedSelectionSort(modifiedNumbers);

        System.out.println("\nAfter modified selection sort: ");

        printArrayElements(modifiedNumbers);
    }

    private static void bubbleSort(int[] array) {
        for(int lastIndex = array.length - 1; lastIndex > 0; --lastIndex) {
            for(int i = 0; i < lastIndex; ++i) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }

    }

    public static void selectionSort(int[] arr) {
        int arrLength = arr.length;

        for(int i = 0; i < arrLength - 1; ++i) {
            int min_index = i;

            int j;
            for(j = i + 1; j < arrLength; ++j) {
                if (arr[j] > arr[min_index]) {
                    min_index = j;
                }
            }

            j = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = j;
        }

    }

    public static void modifiedSelectionSort(int[] array) {
        int arrLength = array.length;

        for(int i = 0; i < arrLength - 1; ++i) {
            int min_index = i;

            for(int j = i + 1; j < arrLength; ++j) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
        }

        bubbleSort(array);
    }

    private static void printArrayElements(int[] array) {
        int[] var1 = array;
        int var2 = array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int j = var1[var3];
            System.out.println(j);
        }

    }
}
