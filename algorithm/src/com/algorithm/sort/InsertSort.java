package com.algorithm.sort;

import com.algorithm.util.SortHelper;

/**
 * @author zhangjin
 * @since 2017/4/24
 */
public class InsertSort {
    public int[] insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                array = SortHelper.swap(array, j, j - 1);
            }
        }

        return array;
    }

    public int[] insertSortBetter(int[] array) {

        for (int i = 1; i < array.length; i++) {
            //先把要判断的值暂存起来
            int e = array[i];
            int j;
            //如果前面的值 比 暂存的值大 那么就把前面赋值到当前位置
            for (j = i; j > 0 && array[j-1] > e; j--) {
                array[j] = array[j - 1];
            }
            //最后遍历完了
            array[j] = e;
        }

        return array;
    }
}
