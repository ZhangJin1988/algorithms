package com.algorithm.sort;

import com.algorithm.util.SortHelper;

public class SelectSortTest {

    /**
     * 选择排序
     *          从第一位开始确定 如果 比他小 那么 就确定  然后 从第二位再判断
     *          外层循环 1 到 length
     *          内存循环 n+1 到 length
     * @param array
     * @return
     */
    public static int[] sort(int[] array){

        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i+1; j < array.length ; j++) {
                if(array[j]<array[index]){
                    index = j;
                }

            }

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }


        return array;
    }

    public static void main(String[] args) {


        int[] array = new int[]{122,3434,35343,34343434,3434343,5335345,535353,2232323,324234};

        int[] sort = sort(array);
        SortHelper.printArray(sort);


    }
}
