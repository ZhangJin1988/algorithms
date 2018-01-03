package com.algorithm.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * @author zhangjin
 * @since 2017/4/24
 */
public class SortHelper {

    //生成n个元素的随机数组 在rangeL 到 rangeR 这个区间的函数
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {
        int[] array = new int[n];

        assert (rangeL < rangeR);
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
//             (int)(Math.random() * (rangeR-rangeL)) + rangeR;
            int temp = rand.nextInt(Integer.MAX_VALUE);
//            System.out.println(temp);
            array[i] = temp % (rangeR - rangeL + 1) + rangeL;

//            System.out.println(array[i]);
        }

        return array;

    }

    public static int[] generateNearlyOrderArray(int n, int swapTimes) {

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        for (int j = 0; j < swapTimes; j++) {
            int x = new Random().nextInt(Integer.MAX_VALUE) % n;
            int y = new Random().nextInt(Integer.MAX_VALUE) % n;
            swap(array, x, y);
        }

        return array;

    }

    public static int[] swap(int[] array, int m, int n) {
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static boolean isSorted(int[] array) {

        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i] < array[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int[] copyArray(int[] array) {
        int[] returnArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            returnArray[i] = array[i];
        }
        return returnArray;
    }

    public static int[] sortBySortNameToSeeSpendTime(int[] array, Object obj, String sortName) {
        long starttime = System.currentTimeMillis();
        Method[] methods = obj.getClass().getMethods();
        boolean canInvoke = false;
        Method method = null;
        for (Method meth : methods) {
//            System.out.println(meth.getName());
            if (meth.getName().equals(sortName)) {
                try {
//                    method = obj.getClass().getMethod(sortName);
                    meth.invoke(obj, array);
                    canInvoke = true;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        if (!canInvoke) {
            System.out.println("方法名写错了");
        }
        long endtime = System.currentTimeMillis();

        long spendtime = (endtime - starttime);

        System.out.println(sortName + "花费了" + spendtime + "微秒");

        assert (isSorted(array));
//        assert (false);

        return array;

    }
}
