package com.algorithm.sort;

import com.algorithm.util.SortHelper;

public class MergeSortTest {

    /**
     * 归并排序 思路分析
     * 1 流程 遍历 递归到底
     * 2  想清楚 子过程 copy一份 数据 然后 比较各个问题 然后 把copy出来的位置重新填充原来的数组 就可以了*
     *
     * @param array
     * @return
     */
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
//        return array;
    }

    /**
     * 拆分的过程 递归到底
     *
     * @param array
     * @param l
     * @param r
     */
    private void mergeSort(int[] array, int l, int r) {


        if (l >= r) {
            return;
        }

        int middle = (l + r) / 2;

        mergeSort(array, l, middle);
        mergeSort(array, middle + 1, r);
        if (array[middle] > array[middle + 1]) {
            merge(array, l, middle, r);
        }
    }

    /**
     * 归并的过程
     *
     * @param array
     * @param l
     * @param r
     */
    private void merge(int[] array, int l, int mid, int r) {

        //首先copy一份数据

//        int[] copyArray = new int[r - l + 1];
//        for (int i = 0; i < r - l + 1; i++) {
//            copyArray[i] = array[l + i];
//        }

        //定义几个需要判断的  左边数组判断起始点 j 右边数组判断起始点
        //判断 copy出来数组的位置 然后 赋值回去原来的数组 完成 归并的过程
//        int j = 0;
//        int k = middle - l + 1;
////        int mid = middle - l;
//
//        //遍历原来的数据即可  确定位置
//        for (int m = 0; m < copyArray.length; m++) {
//            //判断 超出边界的情况
//            // 直接右边赋值
//            if (j > middle - l) {
//                array[l + m] = copyArray[k];
//                k++;
//                //右边超出边界 直接左边赋值
//            } else if (k > r - l) {
//                array[l + m] = copyArray[j];
//                j++;
//                //都在边界内的情况
//                //右边小 取右边
//            } else if (copyArray[j] >= copyArray[k]) {
//                array[l + m] = copyArray[k];
//                k++;
//                //左边小 取左边
//            } else if (copyArray[j] < copyArray[k]) {
//                array[l + m] = copyArray[j];
//                j++;
//            }
//        }


        int[] copyArray = new int[r - l + 1];

        for (int i = 0; i < r - l + 1; i++) {
            copyArray[i] = array[l + i];
        }


        int j = 0;
        int k = mid - l + 1;

        for (int m = 0; m < copyArray.length; m++) {
            if (j > mid - l) {
                array[l + m] = copyArray[k];
                k++;
            } else if (k > r - l) {
                array[l + m] = copyArray[j];
                j++;
            } else if (copyArray[j] >= copyArray[k]) {
                array[l + m] = copyArray[k];
                k++;

            } else if (copyArray[j] < copyArray[k]) {
                array[l + m] = copyArray[j];
                j++;
            }
        }


    }


    public static void main(String[] args) {
        int[] array = new int[]{121312, 242312321, 123213, 2323, 343, 234234, 43324, 23224323, 23423423};
        MergeSortTest mergeSortTest = new MergeSortTest();
        mergeSortTest.sort(array);
        SortHelper.printArray(array);


    }
}
