package com.algorithm.sort;

import com.algorithm.util.SortHelper;

/**
 * Created by zhangjin on 2018/1/8.
 */
public class BubbleSort {



    public int[] bubbleSort(int[] array){
        for(int i = 0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    array= SortHelper.swap(array,j,j+1);
                }
            }
        }
        return  array;
    }
}
