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




    public int[] twoRoadSort(int[] array,int l,int r){

        if(r<=l){
            return array;
        }

        //初始判断的值  第一个大于V的位置 第一个小于V的位置
        int v=array[l];
        //j为小于v的标识点
        int i=l+1;
        //k为大于v的标识点
        int j =r;



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

        SortHelper.swap(array,l,j);


        twoRoadSort(array,l,j-1);

        twoRoadSort(array,j+1,r);



        return array;




    }




        public static void main(String[] args) {
        int[] ints = SortHelper.generateRandomArray(20, 1, 100);
        SortHelper.printArray(ints);
        QuickSortTest quickSortTest = new QuickSortTest();
        int[] sort = quickSortTest.twoRoadSort(ints, 0, ints.length - 1);
        SortHelper.printArray(sort);


    }
}
