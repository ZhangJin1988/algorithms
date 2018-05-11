package com.algorithm.sort;

import com.algorithm.util.SortHelper;

import java.util.Random;

/**
 * Created by zhangjin on 2018/4/7.
 */
public class QuickSortTest {


    public int[] sort(int[] array, int l, int r) {


        if (r <= l) {
            return array;
        }


        //初始判断的值  第一个大于V的位置 第一个小于V的位置
        int v = array[l];
        //j为小于v的标识点
        int j = l;
        //k为大于v的标识点
        int k = l;
        for (int i = l + 1; i < r; i++) {
            if (array[i] < v) {
                SortHelper.swap(array, i, j + 1);
                j++;
                k++;
            } else {
                k++;
            }
        }

        SortHelper.swap(array, l, j);

        sort(array, l, j);
        sort(array, j + 1, r);


        return array;
    }


    public int[] twoRoadSort(int[] array, int l, int r) {

        if (r <= l) {
            return array;
        }

        //初始判断的值  第一个大于V的位置 第一个小于V的位置
        int v = array[l];
        //j为小于v的标识点
        int i = l + 1;
        //k为大于v的标识点
        int j = r;





//
//        while (true){
//
//            if(array[j]<v && j<k-1){
//                j++;
//                continue;
//            }
//            if(array[k]>v && k>j+1){
//                k--;
//                continue;
//            }
//
//            SortHelper.swap(array,j,k);
//            j++;
//            k--;
//
//
//            if(k<j){
//
//                break;
//            }
//        }

        while (true) {
            while (i <= r && array[i] < v) {
                i++;
            }
            while (j >= l + 1 && array[j] > v) {
                j--;
            }
            if (i > j) {
                break;
            }

            SortHelper.swap(array, i++, j--);
        }

        SortHelper.swap(array, l, j);


        twoRoadSort(array, l, j - 1);

        twoRoadSort(array, j + 1, r);


        return array;


    }


//    public int[] threeRoadSort(int[] array, int l, int r) {
//
//        if (r <= l) {
//            return array;
//        }
//
//        //初始判断的值  第一个大于V的位置 第一个小于V的位置
//        int v = array[l];
////        int i=l+1;
//        //lt为小于v的标识点  最右边的点
//        int lt = l;
//        //gt为大于v的标识点 最左边的点
//        int gt = r + 1;
//        int i = l + 1;
//        while (true) {
//            if (i >= gt) {
//                break;
//            }
//            if (array[i] > v) {
//                SortHelper.swap(array, i, gt - 1);
//                gt--;
//                continue;
//            } else if (array[i] < v) {
//                SortHelper.swap(array, i, lt + 1);
//                lt++;
//            }
//            //除去另外两种情况 都需要增加
//            i++;
//
//        }
//        SortHelper.swap(array, l, lt + 1);
//        threeRoadSort(array, l, lt-1);
//        threeRoadSort(array, gt, r);
//
//
//        return array;
//
//
//    }


    public int[] threeRoadQuickSort(int[] array, int l, int r) {

        if (l >= r) {
            return array;
        }


        //随机出比较的坐标V的值
        int index = new Random().nextInt(Integer.MAX_VALUE) % (r - l) + l;

        SortHelper.swap(array, l, index);


        int v = array[l];
        int lt = l;
        int gt = r + 1;
        int i = l + 1;

        while (i < gt) {
            if (array[i] == v) {
                i++;
            } else if (array[i] < v) {
                SortHelper.swap(array, lt + 1, i);
                lt++;
                i++;
            } else {
                SortHelper.swap(array, gt - 1, i);
                gt--;
            }
        }

        SortHelper.swap(array, l, lt);


        threeRoadQuickSort(array, l, lt - 1);
        threeRoadQuickSort(array, gt, r);

        return array;


    }


    public static void main(String[] args) {
        int[] ints = SortHelper.generateRandomArray(20, 1, 100);
        SortHelper.printArray(ints);
        QuickSortTest quickSortTest = new QuickSortTest();
        int[] sort = quickSortTest.threeRoadQuickSort(ints, 0, ints.length - 1);
        SortHelper.printArray(sort);


    }
}
