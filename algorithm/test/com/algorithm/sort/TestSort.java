package com.algorithm.sort;

import com.algorithm.util.SortHelper;
import org.junit.Test;

/**
 * @author zhangjin
 * @since 2017/4/24
 */
public class TestSort {

    @Test
    public void testSelectionSort() {

        int[] array = SortHelper.generateRandomArray(100, 1, 2000);

        SelectionSort sort = new SelectionSort();

        SortHelper.sortBySortNameToSeeSpendTime(array, sort, "selectionSort");

        SortHelper.printArray(array);

    }

    @Test
    public void testInsertSort() {
        int[] tempArray = SortHelper.generateNearlyOrderArray(10, 2);
        SortHelper.printArray(tempArray);

        int[] array = SortHelper.generateRandomArray(10000, 1, 100000);
        int[] array1 = SortHelper.copyArray(array);

        int[] array2 = SortHelper.copyArray(array);
        int[] array3 = SortHelper.copyArray(array);

        InsertSort sort = new InsertSort();

//        array = SortHelper.sortBySortNameToSeeSpendTime(array, sort, "insertSort");
//        SortHelper.printArray(array);
//
//        SelectionSort sort1 = new SelectionSort();
//        array = SortHelper.sortBySortNameToSeeSpendTime(array1, sort1, "selectionSort");
//        SortHelper.printArray(array);
//
//        array = SortHelper.sortBySortNameToSeeSpendTime(array2, sort, "insertSortBetter");
//        SortHelper.printArray(array);


        BubbleSortTest bubbleSort = new BubbleSortTest();

        array = SortHelper.sortBySortNameToSeeSpendTime(array3, bubbleSort, "bubbleSort");
        SortHelper.printArray(array);
        ShellSort sort2 = new ShellSort();
        array = SortHelper.sortBySortNameToSeeSpendTime(array3, sort2, "shellSort");
        SortHelper.printArray(array);


//        SortHelper.printArray(array);

    }

    @Test
    public void testMergeSort() {
        int[] array = SortHelper.generateRandomArray(10000, 1, 100000);
        int[] array1 = SortHelper.copyArray(array);
        MergeSort mergeSort = new MergeSort();
        int[] sorts = SortHelper.sortBySortNameToSeeSpendTime(array, mergeSort, "sort");
        SortHelper.printArray(array);
        SortHelper.sortBySortNameToSeeSpendTime(array1, mergeSort, "sortBetter");
        System.out.println(SortHelper.isSorted(sorts));
        SortHelper.printArray(array1);

    }


    @Test
    public void testQuickSort() {
        int[] array = SortHelper.generateRandomArray(1000000, 1, 100000);
        int[] array1 = SortHelper.copyArray(array);
        int[] array2 = SortHelper.copyArray(array);
        QuickSort quickSort = new QuickSort();
        SortHelper.sortBySortNameToSeeSpendTime(array, quickSort, "sort");
//        SortHelper.printArray(array);
        SortHelper.sortBySortNameToSeeSpendTime(array1, quickSort, "twoRoadSort");
//        SortHelper.printArray(array1);
        SortHelper.sortBySortNameToSeeSpendTime(array2, quickSort, "threeRoadSort");
//        SortHelper.printArray(array2);

    }
}
