package com.algorithm.sort;

/**
 * @author zhangjin
 * @since 2017/4/24
 * 选择排序
 */
public class SelectionSort {
    public  int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);

        }

        return array;
    }

    public  int[] swap(int[] array, int m, int n) {
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
        return array;
    }

    public  void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public boolean isSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
////        int[] array = new int[]{3, 1, 3, 5, 7, 88, 999, 234, 343515, 31241, 242, 14};
//        int[] array = SortHelper.generateRandomArray(10, 1, 200);
//        SelectionSort select = new SelectionSort();
//                SortHelper.sortBySortNameToSeeSpendTime(array, select, "selectionSort");
//        int[] newArray = selectionSort(array);
//
//        printArray(newArray);
//
//    }

}
