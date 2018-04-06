package com.algorithm.sort;

import com.algorithm.util.SortHelper;

/**
 * Created by zhangjin on 2018/1/3.
 */
public class ShellSort {


    public int[] shellSort(int[] array) {


        //n是数组长度
        int n = array.length;
        //i是第一个位置
        //第一层是步长的遍历
        for (int gap = n / 2; gap > 0; gap /= 2) {
            //根据步长 来做 插入排序
            for (int i = gap; i < n; i++) {
                for (int j = i; j - gap >= 0 && array[j] < array[j - gap]; j -= gap) {
                    array = SortHelper.swap(array, j, j - gap);
                }
            }
        }
        return array;

    }







}
