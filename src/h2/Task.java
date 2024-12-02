package h2;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 3, 3, 3, 4, 5, 5};
        System.out.println(Arrays.toString(remuveDubl(nums)));

        int[] arr1 = {1, 4, 8};
        int[] arr2 = {3, 6, 9};

        System.out.println(Arrays.toString(addArray(arr1, arr2)));
        System.out.println(Arrays.toString(addArrayTwo(arr1,arr2)));

    }

    private static int[] addArray(int[] arrOne, int[] arrTwo) {
        int[] arrNew = new int[arrOne.length + arrTwo.length];
        int count = 0;
        for (int i = 0; i < arrOne.length; i++) {
            arrNew[count] = arrOne[i];
            count++;
        }
        for (int j = 0; j < arrTwo.length; j++) {
            arrNew[count] = arrTwo[j];
            count++;
        }
        for (int i = 0; i < arrNew.length - 1; i++) {
            for (int j = 0; j < arrNew.length - 1 - i; j++) {
                if (arrNew[j] > arrNew[j + 1]) {
                    int temp = arrNew[j];
                    arrNew[j] = arrNew[j + 1];
                    arrNew[j + 1] = temp;
                    }
                }
            }
            return arrNew;
        }

    private static int[] addArrayTwo(int[] arrOne, int[] arrTwo){
        int [] arrNew = new int[arrOne.length + arrTwo.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrOne.length && j < arrTwo.length) {
            if (arrOne[i] < arrTwo[j]) {
                arrNew[k++] = arrOne[i++];
            } else {
                arrNew[k++] = arrTwo[j++];
            }
        }
        while (i < arrOne.length) {
            arrNew[k++] = arrOne[i++];
        }
        while (j < arrTwo.length) {
            arrNew[k++] = arrTwo[j++];
        }

        return arrNew;
    }

        private static int[] remuveDubl ( int[] arr){
            int[] arrNew = new int[arr.length];
            arrNew[0] = arr[0];
            int count = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    arrNew[count] = arr[i];
                    count++;
                }
            }
            return arrNew;
        }
    }



