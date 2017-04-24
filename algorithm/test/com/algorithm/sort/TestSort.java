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

        array = SortHelper.sortBySortNameToSeeSpendTime(array, sort, "selectionSort");

//        SortHelper.printArray(array);

    }

    @Test
    public void testInsertSort() {
        int[] tempArray = SortHelper.generateNearlyOrderArray(10,2);
        SortHelper.printArray(tempArray);

        int[] array = SortHelper.generateRandomArray(100000, 1, 1000);
        int[] array1 = SortHelper.copyArray(array);

        int[] array2 = SortHelper.copyArray(array);

        InsertSort sort = new InsertSort();

        array = SortHelper.sortBySortNameToSeeSpendTime(array, sort, "insertSort");
        SelectionSort sort1 = new SelectionSort();
        array = SortHelper.sortBySortNameToSeeSpendTime(array1, sort1, "selectionSort");
        array = SortHelper.sortBySortNameToSeeSpendTime(array2, sort, "insertSortBetter");

//        SortHelper.printArray(array);

    }
}
