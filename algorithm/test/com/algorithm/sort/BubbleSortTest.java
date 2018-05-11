package com.algorithm.sort;

import com.algorithm.util.SortHelper;

public class BubbleSortTest {


    /**
     * 冒泡排序   先确定最后一位 就像冒泡泡一样
     * 外层循环 遍历到最后一位 前两个比较 再后两个比较 直到最后一位 先确定最后一位  然后 再确定倒数第二位
     * 内层循环 两个两个比较 大的交换到后面
     * 边界问题 要想清楚 自己一定要 心算一遍
     *
     * @param array
     * @return
     */
    public static int[] sort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            //内存循环
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        return array;
    }


    public static int[] sortBetter(int[] array) {


        for (int i = array.length - 1; i > 0; i--) {

//            int temp = array[i];
            int index = i;
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    index = j;
                }
            }

            //最后交换下标   只交换一次 还是要想清楚 哈哈哈

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        return array;


    }


    public static void main(String[] args) {
        int[] array = new int[]{3, 3434, 2343, 23432, 3525235, 1323, 34234};
        int[] sort = sortBetter(array);
        SortHelper.printArray(sort);


    }
}
