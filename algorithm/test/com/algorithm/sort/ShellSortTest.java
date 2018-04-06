package com.algorithm.sort;

import com.algorithm.util.SortHelper;

/**
 * Created by zhangjin on 2018/4/6.
 */
public class ShellSortTest
{


    public int[] shellSort(int[] array){
        int length = array.length;

//        int i,j,gap;
//        gap = length/2;
        for(int gap=length/2;gap>=1;gap=gap/2){

            //插入排序
            for(int i=gap;i<length;i+=gap){
                for(int j=i;j>=gap;j-=gap){
                    if(array[j-gap]>array[j]){
                        SortHelper.swap(array,j,j-gap);
                    }


                }
            }
        }

        return  array;
    }


    public static void main(String[] args) {

        int[] ints = SortHelper.generateRandomArray(20, 1, 30);
        ShellSortTest test = new ShellSortTest();

        int[] ints1 = test.shellSort(ints);
        SortHelper.printArray(ints1);

    }
}
