package day;

/**
 * @ClassName Solution
 * @Author tang
 * @Date 2020/4/18 0018 下午 1:59
 * @Version 1.0
 */
public class Solution {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是数组中同一个元素不能使用两遍。
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] twoSum = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(twoSum[0] + "," + twoSum[1]);
    }

}
