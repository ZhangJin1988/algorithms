package com.algorithm.sort;

public class MergeSort {

    public int[] sort(int[] array) {


        int[] sorted = new int[array.length];
        mergeSort(array, 0, array.length - 1);


        return sorted;
    }



    public int[] sortBetter(int[] array) {


        int[] sorted = new int[array.length];
        mergeSort(array, 0, array.length - 1);


        return sorted;
    }


    public void mergeSortBetter(int[] array, int l, int r) {

        //l r 都是数组下标

        if (l >= r) {
            return;
        }

//        if (l -r < 16 ) {
//            InsertSort insertSort = new InsertSort();
//            insertSort.insertSort(array);
//        }


        int mid = (r + l) / 2;
        mergeSort(array, l, mid);
        mergeSort(array, mid + 1, r);
        if(array[mid]>array[mid+1]){
            merge(array, l, mid, r);
        }
    }





    public void mergeSort(int[] array, int l, int r) {

        //l r 都是数组下标

        if (l >= r) {
            return;
        }
        int mid = (r + l) / 2;
        mergeSort(array, l, mid);
        mergeSort(array, mid + 1, r);
        merge(array, l, mid, r);
    }



    public void merge(int[] array,int l ,int mid,int r) {

        int[] copyArray = new int[r-l+1];

        for(int i = 0;i<r-l+1;i++) {
                copyArray[i]=array[l+i];
        }


        int j = 0;
        int k = mid-l+1;

        for(int m = 0;m<copyArray.length;m++) {
            if(j>mid-l) {
                array[l+m]=copyArray[k];
                k++;
            }else if(k>r-l) {
                array[l+m]=copyArray[j];
                j++;
            } else if(copyArray[j]>=copyArray[k]) {
                    array[l+m] = copyArray[k];
                    k++;

            }else if(copyArray[j]<copyArray[k]) {
                array[l+m] = copyArray[j];
                j++;
            }
        }











    }




//    public int[] merge(int[] array, int l, int mid, int r) {
//        int[] sorted = new int[r - l + 1];
//
//        for (int m = l; m <= r; m++) {
//            sorted[m - l] = array[m];
//        }
//
//        int i = l, j = mid + 1;
//
//        //是通过临时copy的sorted数组 来 遍历真实的array数组
//
//        for (int k = l; k <= r; k++) {
//
//            if (i > mid) {
//                array[k] = sorted[j - l];
//                j++;
//            } else if (j > r) {
//                array[k] = sorted[i - l];
//                i++;
//            } else if (sorted[i - l] > sorted[j - l]) {
//                array[k] = sorted[j - l];
//                j++;
//            } else {
//                array[k] = sorted[i - l];
//                i++;
//            }
//
//        }


//        return array;
//    }


}
