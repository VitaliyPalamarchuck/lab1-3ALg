package org.example;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BasicAlgSortTest {

    @Test
    public void testBubbleSortWhenArraysWithIntegerTypesAndRangeEqualsLength() {
        Integer[] sourceArray = new Integer[]{5, 4, 10, 2, 1};
        Integer[] destArray = new Integer[]{1, 2, 4, 5, 10};
        BasicAlgSort<Integer> integerBasicAlgSort = new BasicAlgSort<>(sourceArray);
        integerBasicAlgSort.bubbleSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);

        Integer[] sourceArrayDesc = new Integer[]{5, 4, 10, 2, 1};
        Integer[] destArrayDesc = new Integer[]{10, 5, 4, 2, 1};
        BasicAlgSort<Integer> integerBasicAlgSortDesc = new BasicAlgSort<>(sourceArrayDesc);
        integerBasicAlgSortDesc.SortingFlag = true;
        integerBasicAlgSortDesc.bubbleSortAsc();
        assertThat(integerBasicAlgSortDesc.getArray()).isEqualTo(destArrayDesc);
    }

    @Test
    public void testselectionSortWhenArraysWithIntegerTypesAndRangeEqualsLength() {
        Integer[] sourceArray = new Integer[]{5, 4, 10, 2, 1};
        Integer[] destArray = new Integer[]{1, 2, 4, 5, 10};
        BasicAlgSort<Integer> integerBasicAlgSort = new BasicAlgSort<>(sourceArray);
        integerBasicAlgSort.selectionSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);

        Integer[] sourceArrayDesc = new Integer[]{5, 4, 10, 2, 1};
        Integer[] destArrayDesc = new Integer[]{10, 5, 4, 2, 1};
        BasicAlgSort<Integer> integerBasicAlgSortDesc = new BasicAlgSort<>(sourceArrayDesc);
        integerBasicAlgSortDesc.SortingFlag = true;
        integerBasicAlgSortDesc.selectionSortAsc();
        assertThat(integerBasicAlgSortDesc.getArray()).isEqualTo(destArrayDesc);
    }


    @Test
    public void testInsertionSortWhenArraysWithIntegerTypesAndRangeEqualsLength() {
        //Integer[] sourceArrayAsc = new Integer[]{5, 4, 10, 2, 1, 8, -5, 0};
        //Integer[] expectedAsc = new Integer[]{-5, 0, 1, 2, 4, 5, 8, 10};
        Integer[] sourceArrayAsc = getRandomInteger(10000);
        BasicAlgSort<Integer> integerBasicAlgSortAsc = new BasicAlgSort<>(sourceArrayAsc);
        integerBasicAlgSortAsc.insertionSortWithLinearSearch();
        //assertThat(integerBasicAlgSortAsc.getArray()).isEqualTo(expectedAsc);

        //Integer[] sourceArrayDesc = new Integer[]{5, 4, 10, 2, 1, 8, -5, 0};
        //Integer[] destArrayDesc = new Integer[]{10, 8, 5, 4, 2, 1, 0, -5};
        Integer[] sourceArrayDesc = getRandomInteger(10000);
        BasicAlgSort<Integer> integerBasicAlgSortDesc = new BasicAlgSort<>(sourceArrayDesc);
        integerBasicAlgSortDesc.SortingFlag = true;
        integerBasicAlgSortDesc.insertionSortWithLinearSearch();
        //assertThat(integerBasicAlgSortDesc.getArray()).isEqualTo(destArrayDesc);

    }

    @Test
    public void testInsertionSortWithBinaryWhenArraysWithIntegerTypesAndRangeEqualsLength() {
        //Integer[] sourceArray = new Integer[]{5, 4, 10, 2, 1, 8, -5, 0};
        //Integer[] destArray = new Integer[]{-5, 0, 1, 2, 4, 5, 8, 10};
        Integer[] sourceArray = getRandomInteger(10000);
        BasicAlgSort<Integer> integerBasicAlgSort = new BasicAlgSort<>(sourceArray);
        integerBasicAlgSort.SortingFlag = false; // Явно встановлюємо
        integerBasicAlgSort.insertionSortWithBinarySearchAsc();
        //assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);

        //Integer[] sourceArrayDesc = new Integer[]{5, 4, 10, 2, 1, 8, -5, 0};
        //Integer[] expectedDesc = new Integer[]{10, 8, 5, 4, 2, 1, 0, -5};
        Integer[] sourceArrayDesc = getRandomInteger(10000);
        BasicAlgSort<Integer> integerBasicAlgSortDesc = new BasicAlgSort<>(sourceArrayDesc);
        integerBasicAlgSortDesc.SortingFlag = true; // Явно встановлюємо
        integerBasicAlgSortDesc.insertionSortWithBinarySearchAsc();
        //assertThat(integerBasicAlgSortDesc.getArray()).isEqualTo(expectedDesc);

    }


    public static Integer[] getRandomInteger(int n) {
        Integer[] sourceArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            sourceArray[i] = new Random().nextInt(200) - 100;
        }
        return sourceArray;
    }


}
