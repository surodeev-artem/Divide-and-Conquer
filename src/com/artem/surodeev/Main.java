package com.artem.surodeev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(recursiveSearch(array, 6));
    }

    private static int recursiveSearch(int[] array, int searchElement) {
        int countOfElements = array.length;
        int indexOfMiddleElement = (int)countOfElements/2;
        int middleElement = array[indexOfMiddleElement];
        if (searchElement == middleElement) {
            return middleElement;
        } else if (searchElement > middleElement) {
            return recursiveSearch(Arrays.copyOfRange(array, indexOfMiddleElement + 1, countOfElements), searchElement);
        } else if (searchElement < middleElement) {
            return recursiveSearch(Arrays.copyOfRange(array, 0, indexOfMiddleElement), searchElement);
        } else {
            return -1;
        }
    }
}
