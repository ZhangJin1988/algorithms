package com.algorithm.sort;

import com.algorithm.util.SortHelper;

import java.util.Random;

/**
 * Created by zhangjin on 2018/1/3.
 */
public class QuickSort {


    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);

        return array;

    }

    public void quickSort(int[] array, int l, int r) {


        if (l >= r) {
            return;
        }


        //随机出比较的坐标V的值
        int index = new Random().nextInt(Integer.MAX_VALUE) % (r - l) + l;

        System.out.println(index + "  -----index");
        SortHelper.swap(array, l, index);


        int p = partition(array, l, r);
        quickSort(array, l, p - 1);
        quickSort(array, p + 1, r);
    }

    //需要几个标示位  i 0 起始位 j 小于v的起点 k 大于v的起点
    private int partition(int[] array, int l, int r) {
        //标记小于v的最后位置
        int j = l;
        for (int k = l + 1; k <= r; k++) {
            if (j < r && array[k] < array[l]) {
                SortHelper.swap(array, k, j +1);
                j++;
            }
        }
        SortHelper.swap(array,l,j);
        return j;
    }


}
