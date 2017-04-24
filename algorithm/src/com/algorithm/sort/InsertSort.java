package com.algorithm.sort;

import com.algorithm.util.SortHelper;

/**
 * @author zhangjin
 * @since 2017/4/24
 */
public class InsertSort {
    public int[] insertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
//            int index = i;
            for (int j = i; j > 0; j--) {
//                System.out.println(j);
                if (array[j] < array[j - 1]) {
                    array = SortHelper.swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return array;
    }

    public int[] insertSortBetter(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int e = array[i];
            int j;
            for (j = i; j > 0 && array[j] > e; j--) {
                array[j] = array[j - 1];
            }
            array[j] = e;
        }

        return array;
    }
}
