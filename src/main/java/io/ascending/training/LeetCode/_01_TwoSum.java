package io.ascending.training.LeetCode;

public class _01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] map = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target - nums[i] && map[target - nums[i]] != 0) {
                return new int[]{i, map[target - nums[i]] - 1};
            }

            map[nums[i]] = i + 1;
        }

        return null;
    }

    public static void main(String[] args) {
        _01_TwoSum tmp = new _01_TwoSum();

        tmp.twoSum(new int[]{2, 7, 11, 15}, 9);

    }
}
