public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 3, -5, 2, -4};
        System.out.println("The maximum product is: " + maxProductOfTwo(nums));
    }

    public static int maxProductOfTwo(int[] nums) {
        if (nums.length < 2)
            return 0; // Edge case, although it's stated there are at least two elements

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // Find the two largest numbers
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Find the two smallest numbers
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // The maximum product is either the product of the two largest or the two smallest
        return Math.max(max1 * max2, min1 * min2);
    }
}