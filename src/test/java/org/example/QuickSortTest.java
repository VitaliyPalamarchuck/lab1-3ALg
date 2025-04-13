package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class QuickSortTest {

    @Test
    void quickSortArray() {
        long startTime=System.currentTimeMillis();
        Integer [] sourceArray=new Integer[]{-5,4,10,2,1,8,-5,0};
        Integer [] expectArray=new Integer[]{-5,-5,0,1,2,4,8,10};
        QuickSort<Integer> quickSortAlg = new QuickSort<>(sourceArray);
        quickSortAlg.quickSortArray(0,sourceArray.length-1,true,"last");
        assertThat(quickSortAlg.getArray()).isEqualTo(expectArray);
        long endTime=System.currentTimeMillis();
        long time =endTime-startTime;
        System.out.println("Час виконання quickSortArray: " + time + " мс");
    }
    @Test
    void quickSortDescending() {
        long startTime=System.currentTimeMillis();
        Integer[] sourceArray = new Integer[]{-5, 4, 10, 2, 1, 8, -5, 0};
        Integer[] expectArrayDesc = new Integer[]{10, 8, 4, 2, 1, 0, -5, -5};
        QuickSort<Integer> quickSortAlg = new QuickSort<>(sourceArray);
        quickSortAlg.quickSortArray(0, sourceArray.length - 1, false,"last");
        assertThat(quickSortAlg.getArray()).isEqualTo(expectArrayDesc);
        long endTime=System.currentTimeMillis();
        long time =endTime-startTime;
        System.out.println("Час виконання quickSortDescending: " + time + " мс");
    }

    @Test
    void quickSortMiddleArray() {
        long startTime=System.currentTimeMillis();
        Integer [] sourceArray=new Integer[]{-5,4,10,2,1,8,-5,0};
        Integer [] expectArray=new Integer[]{-5,-5,0,1,2,4,8,10};
        QuickSort<Integer> quickSortAlg = new QuickSort<>(sourceArray);
        quickSortAlg.quickSortArray(0,sourceArray.length-1,true,"middle");
        assertThat(quickSortAlg.getArray()).isEqualTo(expectArray);
        long endTime=System.currentTimeMillis();
        long time =endTime-startTime;
        System.out.println("Час виконання quickSortMiddleArray: " + time + " мс");
    }
    @Test
    void quickSortFirstArray() {
        long startTime=System.currentTimeMillis();
        Integer [] sourceArray=new Integer[]{-5,4,10,2,1,8,-5,0};
        Integer [] expectArray=new Integer[]{-5,-5,0,1,2,4,8,10};
        QuickSort<Integer> quickSortAlg = new QuickSort<>(sourceArray);
        quickSortAlg.quickSortArray(0,sourceArray.length-1,true,"first");
        assertThat(quickSortAlg.getArray()).isEqualTo(expectArray);
        long endTime=System.currentTimeMillis();
        long time =endTime-startTime;
        System.out.println("Час виконання quickSortFirstArray: " + time + " мс");
    }
    @Test
    void quickSortRandomArray() {
        long startTime=System.currentTimeMillis();
        Integer[] sourceArray = new Integer[]{-5, 4, 10, 2, 1, 8, -5, 0};
        Integer[] expectedArray = new Integer[]{-5, -5, 0, 1, 2, 4, 8, 10};
        QuickSort<Integer> quickSort = new QuickSort<>(sourceArray);
        quickSort.quickSortArray(0, sourceArray.length - 1, true, "random");
        assertThat(quickSort.getArray()).isEqualTo(expectedArray);
        long endTime=System.currentTimeMillis();
        long time =endTime-startTime;
        System.out.println("Час виконання quickSortRandomArray: " + time + " мс");
    }
}