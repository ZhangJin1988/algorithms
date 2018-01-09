package com.algorithm.sort;

/**
 * Created by zhangjin on 2018/1/9.
 */
public class MergeSort {

    public int[] sort(int[] array) {


        int[] sorted = new int[array.length];
        mergeSort(array, 0, array.length - 1, sorted);


        return sorted;
    }

    public void mergeSort(int[] array, int l, int r, int[] sorted) {

        //l r 都是数组下标

        if (r - l < 2) {
            return;
        }
        int mid = (r-l) / 2;
        int[] sorted1 = new int[mid + 1];
        int[] sorted2 = new int[r - mid];


        mergeSort(array, l, mid, sorted1);
        mergeSort(array, mid + 1, r, sorted2);
        merge(array, l, mid, r, sorted);
    }

    public int[] merge(int[] array, int l, int mid, int r, int[] sorted) {
        int i = l, j = mid + 1, k = 0;
        while (k <sorted.length) {
            if (i <= mid && j <= r) {
                if (array[i] >= array[j]) {
                    sorted[k] = array[j];
                    k++;
                    j++;
                } else if (array[i] < array[j]) {
                    sorted[k] = array[i];
                    k++;
                    i++;
                }
            } else if (i > mid && j <= r) {
                sorted[k] = array[j];
                k++;
                j++;
            } else if (i <= mid && j > r) {
                sorted[k] = array[i];
                k++;
                i++;
            } else if (i>mid && j>r){
                k++;
            }else {
                k++;
            }
        }

        return sorted;
    }


}
