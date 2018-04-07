package com.algorithm.sort;

import com.algorithm.util.SortHelper;

/**
 * Created by zhangjin on 2018/4/7.
 */
public class QuickSortTest {


    public int[] sort(int[] array,int l,int r){


        if(r<=l){
            return array;
        }


        //初始判断的值  第一个大于V的位置 第一个小于V的位置
        int v=array[l];
//        for(int i=l;int j=l;int e=l+1;e<=r;e++){
//
//        }

        //j为小于v的标识点
        int j=l;
        //k为大于v的标识点
        int k =l;
        for (int i = l+1; i <r; i++) {
           if(array[i]<v){
                SortHelper.swap(array,i,j+1);
                j++;
                k++;
            }else{
               k++;
           }
        }

        SortHelper.swap(array,l,j);

        sort(array,l,j);
        sort(array,j+1,r);






        return array;
    }

    public static void main(String[] args) {
        int[] ints = SortHelper.generateRandomArray(20, 1, 100);
        SortHelper.printArray(ints);
        QuickSortTest quickSortTest = new QuickSortTest();
        int[] sort = quickSortTest.sort(ints, 0, ints.length - 1);
        SortHelper.printArray(sort);


    }
}
