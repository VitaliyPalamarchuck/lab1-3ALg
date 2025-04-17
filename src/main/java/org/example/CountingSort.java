package org.example;

import java.util.Arrays;
public class CountingSort {
    static void sort(int arr[]) {
        int n = arr.length; // записуємо у змінну n кількість елементів масиву
        int output[] = new int[n]; // створюємо вихідний масив на n елементів

        int count[] = new int[11];
        for (int i = 0; i < count.length; ++i)
            count[i] = 0;

        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        System.out.println("Значення повторюавності елементів у масиві: ");
        for (int i = 0; i < n; ++i)
            System.out.print(count[i] + " ");
        System.out.println();

        for (int i = 1; i <= 10; ++i)
            count[i] += count[i - 1];

        System.out.println("Значення суми count[i] та count[i-1]: ");
        for (int i = 0; i < n; ++i)
            System.out.print(count[i] + " ");
        System.out.println();

        /*for (int i = 0; i < n; ++i) {                //зростання
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }*/
        for (int i = n - 1; i >= 0; --i) {             //спадання
            output[n - count[arr[i]]] = arr[i];
            --count[arr[i]];
        }
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }

    public static void main(String args[]) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 11));
        }
        System.out.println("Вхідний масив: ");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Вихідний масив: ");
        System.out.println(Arrays.toString(arr));
    }

}
