package h1;

public class Empty {

    public static void main(String[] args) {
        int[] nums = {45, 2, 83, 4,6,1,0};
        //System.out.println(findMin(nums));

        findMinTwo(nums);
        findMinTwoFour(nums);


    }

    private static void findMinTwo(int[] nums) {
        int min = 0;
        int min2 = 0;


        if (nums[0] < nums[1]) {
            min = nums[0];
            min2 = nums[1];
        } else {
            min = nums[1];
            min2 = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < min) {

                min2 = min;
                min = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        System.out.println("min1 = " + min + " min2 = " + min2);
    }


    private static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    private static void findMinTwoFour(int[] nums) {
        int min1 = 0;
        int min2 = 0;
        int min3 = 0;
        int min4 = 0;

        if (nums[0] < nums[1]) {
            min1 = nums[0];
            min2 = nums[1];
        } else {
            min1 = nums[1];
            min2 = nums[0];
        }


        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < min1) {
                min4 = min3;
                min3 = min2;
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min4 = min3;
                min3 = min2;
                min2 = nums[i];
            } else if (nums[i] < min3) {
                min4 = min3;
                min3 = nums[i];
            } else if (nums[i] < min4) {
                min4 = nums[i];
            }
        }
        System.out.println("min1 = " + min1 + " min2 = " + min2 + " min3 = " + min3 + " min4 = " + min4);
    }
}

