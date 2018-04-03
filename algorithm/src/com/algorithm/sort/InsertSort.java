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
            for (j = i; j > 0 && array[j - 1] > e; j--) {
                array[j] = array[j - 1];
            }
            //最后遍历完了
            array[j] = e;
        }

        return array;
    }


    private int[] sortTest(int[] array) {


        return null;
    }


    private int[] inertSort2(int[] array) {


        int m = array.length;

        for (int i = 1; i < m; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }


        return array;


    }


    private int[] inertSortBetter(int[] array) {
        int m = array.length;
        int temp;
        int j;
        for (int i = 1; i < m; i++) {
            temp = array[i];
            j = i;
            for (; j > 0; j--) {
                if (array[j] <= array[j - 1]) {
                    System.out.println("判断之前的j是" + j);
                    array[j] = array[j-1];
                }else if(array[j] > array[j - 1]){
                    break;
                }

            }

            System.out.println("判断之后的j是" + j);
            array[j] = temp;
        }


        return array;


    }


    public static void main(String[] args) {
        int[] ints = SortHelper.generateNearlyOrderArray(10, 3);
        SortHelper.printArray(ints);


        int[] ints2 = SortHelper.copyArray(ints);
        InsertSort insertSort = new InsertSort();
        int[] ints1 = insertSort.inertSort2(ints);

        System.out.println("---------");
        SortHelper.printArray(ints1);

        System.out.println("-------");
        SortHelper.printArray(ints2);


        int[] ints3 = insertSort.inertSortBetter(ints2);
        System.out.println("--------");
        SortHelper.printArray(ints3);


    }


}
