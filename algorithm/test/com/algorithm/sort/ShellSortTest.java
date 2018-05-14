package com.algorithm.sort;

import com.algorithm.util.SortHelper;

/**
 * Created by zhangjin on 2018/4/6.
 */
public class ShellSortTest {

    /**
     * 希尔排序是插入排序的变种
     * 是会定义一个步长 然后  自己 根据步长 进行插入排序  想清楚 各种边界问题
     *
     * 边界问题 想清楚 啊啊啊
     *
     * @param array
     * @return
     */

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


    public int[] shellTwo(int[] array) {


        //定义各个节点
        // i 步长的遍历 j 插入排序外层循环 k是插入排序内部循环
        int i, j, k, gap;

        //步长的遍历
        for (gap = array.length / 2; gap >= 1; gap /= 2) {

            //单个步长内的循环
            for (i = 0; i < gap; i++) {
                //插入排序的循环
                for (j = i + gap; j < array.length; j += gap) {
                    for (k = j; k >= gap; k -= gap) {
                        if (array[k] < array[k - gap]) {
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

        int[] ints1 = test.shellTwo(ints);
        SortHelper.printArray(ints1);

    }
}
