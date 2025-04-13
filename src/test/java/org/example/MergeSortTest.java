package org.example;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortTest {

    @Test
    public void testMergeSort(){
        long startTime=System.currentTimeMillis();
        Integer[] sourceArray =getRandomInteger(20);
        Integer[] expectArray = Arrays.copyOf(sourceArray, sourceArray.length);
        Arrays.sort(expectArray);
        Collections.reverse(Arrays.asList(expectArray));
        MergeSort<Integer>mergeSortAlg=new MergeSort<>(sourceArray);
        mergeSortAlg.mergeSort();
        assertThat(mergeSortAlg.getArray()).isEqualTo(expectArray);
        long endTime=System.currentTimeMillis();
        long time =endTime-startTime;
        System.out.println("Час виконання testMergeSort: " + time + " мс");
    }






    public static Integer[] getRandomInteger(int n) {
        Integer[] sourceArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            sourceArray[i] = new Random().nextInt(200) - 100;
        }
        return sourceArray;
    }
    /*@Test
    public void testMergeSort(){
        Integer[] sourceArray =new Integer[]{-5,4,10,2,1,8,-5,0};
        Integer[] expectArray = new Integer[]{-5,-5,0,1,2,4,8,10};
        MergeSort<Integer>mergeSortAlg=new MergeSort<>(sourceArray);
        mergeSortAlg.mergeSort();
        assertThat(mergeSortAlg.getArray()).isEqualTo(expectArray);
    }*/
}
