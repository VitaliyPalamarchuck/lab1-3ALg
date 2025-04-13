package org.example;

import java.util.Arrays;
import java.util.Random;

public class QuickSort<T extends Comparable<T>> {
    T[] array;

    public QuickSort(T[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public T[] getArray() {
        return array;
    }

    public void quickSortArray(int first, int last, boolean SortingFlag, String pivotStrategy) {
        if (first < last) {
            int pivotIndex = partition(first, last, SortingFlag, pivotStrategy);
            quickSortArray(first, pivotIndex - 1, SortingFlag, pivotStrategy);
            quickSortArray(pivotIndex + 1, last, SortingFlag, pivotStrategy);
        }
    }

    private int partition(int first, int last, boolean SortingFlag, String pivotStrategy) {
        T pivotElement;
        switch (pivotStrategy) {
            case "first":
                pivotElement = array[first];
                swap(first, last);
                break;
            case "middle":
                int middle = (first + last) / 2;
                pivotElement = array[middle];
                swap(middle, last);
                break;
            case "random":
                Random random = new Random();
                int randomIndex = first + random.nextInt(last - first + 1);
                pivotElement = array[randomIndex];
                swap(randomIndex, last);
                break;
            default: // "last"
                pivotElement = array[last];
        }

        int i = first - 1;
        for (int j = first; j < last; j++) {
            if (SortingFlag ? array[j].compareTo(pivotElement) <= 0 : array[j].compareTo(pivotElement) >= 0) {
                i++;
                if (i != j) {
                    swap(i, j);
                }
            }
        }
        swap(i + 1, last);
        return i + 1;
    }

    private void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
