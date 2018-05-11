package com.algorithm.sort;

import com.algorithm.util.SortHelper;

public class InertSort {


    /**
     * 插入排序思路
     *      插入排序 是 第n个 永远跟他的前一个做比较 如果 小于的话 就交换
     *      第一种 遍历前2个 再遍历 前3个 再遍历 前4个 再遍历前5个 知道遍历到最后一个
     *              子过程 最小的算法维度  就是 和前一个比较
     *                    退出比较 是 前一个到达0的位置
     *              外层循环退出条件 就是 遍历到最后一个
     *
     *
     * @param array
     * @return
     */
    public static int[] sort(int[] array){

        //外层循环 遍历到最后的位置
        for (int i = 1; i < array.length; i++) {

            //内存循环 遍历到最小的位置
            for(int j = i;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }


    /**
     * 优化   记录要交换的位置 当光标停留在位置后 做最后一次的交换
     *
     * @param args
     */


    public static int[] sortBetter(int[] array){

        for (int i = 1; i <array.length ; i++) {

            int index = i;
            int temp  = array[i];
            for (int j = i; j >0; j--) {
                if(array[j-1]>temp){
                    array[j] = array[j-1];
                    index--;
                }
            }

            array[index] = temp;

        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,3434,2343,23432,3525235,1323,34234};
        int[] sort = sortBetter(array);

        SortHelper.printArray(sort);

    }
}
