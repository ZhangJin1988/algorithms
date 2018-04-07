package com.algorithm.sort;

import com.algorithm.util.SortHelper;

/**
 * Created by zhangjin on 2018/4/6.
 */
public class ShellSortTest {


    public int[] shellSort(int[] array) {
        int length = array.length;
        int i, j, k, gap;
        for (gap = length / 2; gap >= 1; gap = gap / 2) {
            for (i = 0; i < gap; i++) {
                //插入排序
                for (j = i + gap; j < length; j += gap) {
                    for (k = j; k >= gap; k -= gap) {
                        if (array[k - gap] > array[k]) {
                            SortHelper.swap(array, k, k - gap);
                        }
                    }
                }
            }
        }

        return array;
    }


    public static void main(String[] args) {

        int[] ints = SortHelper.generateRandomArray(20, 1, 30);
        ShellSortTest test = new ShellSortTest();

        int[] ints1 = test.shellSort(ints);
        SortHelper.printArray(ints1);

    }
}
