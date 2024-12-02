package h2;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 3, 3, 3, 4, 5, 5};
        System.out.println(Arrays.toString(remuveDubl(nums)));

    }

    private static int[] remuveDubl(int[] arr) {
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



