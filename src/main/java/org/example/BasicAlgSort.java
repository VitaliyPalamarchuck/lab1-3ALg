package org.example;

import java.util.Arrays;


public class BasicAlgSort <T extends Comparable<? super T>>{

    private int left;
    private int right;
    private T[] array;
    boolean SortingFlag;
    public BasicAlgSort(T[] array){ this.array=Arrays.copyOf(array, array.length);}


    public BasicAlgSort(int left, int right, T[] array, boolean sortingFlag) {
        this.left = left;
        this.right = right;
        this.array = array;
        SortingFlag = sortingFlag;
    }

    public T[] getArray(){return array;}

    public void bubbleSortAsc(){
        boolean flagForInteration = true;
        while (flagForInteration){
            flagForInteration=false;
            for (int i =1; i<array.length;i++){
                if(SortingFlag ? array[i].compareTo(array[i - 1]) > 0 : array[i].compareTo(array[i - 1]) < 0){
                    swap(i, i-1);
                    if(!flagForInteration){
                        flagForInteration=true;
                    }
                }
            }
        }
    }

    private void swap(int leftIndex, int rightIndex) {
        T temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex]=temp;
    }
    public void selectionSortAsc() {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            T element = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (SortingFlag ? array[j].compareTo(element) > 0 : array[j].compareTo(element) < 0) {
                    element = array[j];
                    index = j;
                }
            }
            if (i != index) {
                swap(i, index);
            }
        }
    }
    public void insertionSortWithLinearSearch() {
        long startTime=System.currentTimeMillis();
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i;
            while (j > 0 && (SortingFlag ? key.compareTo(array[j - 1]) > 0 : key.compareTo(array[j - 1]) < 0)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = key;
        }

        long endTime=System.currentTimeMillis();
        long time =endTime-startTime;
        System.out.println("Час виконання insertionSortWithLinearSearch: " + time + " мс");
    }


    public void insertionSortWithBinarySearchAsc() {
        long startTime=System.currentTimeMillis();

        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int leftIndex = 0;
            int rightIndex = i - 1;
            if (SortingFlag ? key.compareTo(array[i - 1]) > 0 : key.compareTo(array[i - 1]) < 0) {
                while (leftIndex <= rightIndex) {
                    int serIndex = (rightIndex + leftIndex) / 2;
                    if (SortingFlag ? key.compareTo(array[serIndex]) > 0 : key.compareTo(array[serIndex]) < 0) {
                        rightIndex = serIndex - 1;
                    } else {
                        leftIndex = serIndex + 1;
                    }
                }
                for (int j = i; j > leftIndex; j--) {
                    array[j] = array[j - 1];
                }
                array[leftIndex] = key;
            }
        }
        long endTime=System.currentTimeMillis();
        long time =endTime-startTime;
        System.out.println("Час виконання insertionSortWithBinarySearchAsc: " + time + " мс");

    }




}
