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




    public int[] bubbleSort2(int[] array){

        int length = array.length;

        for(int i=length;i>0;i--){

            for(int j=0;j+1<i;j++){

                if(array[j]>array[j+1]){
                    SortHelper.swap(array,j,j+1);
                }

            }


        }


        return array;


    }





    public void bubbleSoft(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j <  length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }


    }





    public int[] sort(int[] array){



        int length = array.length;

        for(int i=length;i>=0;i--){

            for(int j =0;j<length-1;j++){

                if(array[j]>array[j+1]){
                    SortHelper.swap(array,j,j+1);
                }
            }
        }

        return array;
    }
























    public static void main(String[] args) {

        int[] ints = SortHelper.generateRandomArray(20, 1, 100);
        SortHelper.printArray(ints);
        BubbleSort bubbleSort = new BubbleSort();
        int[] ints1 = bubbleSort.bubbleSort(ints);

        SortHelper.printArray(ints1);


    }
}
