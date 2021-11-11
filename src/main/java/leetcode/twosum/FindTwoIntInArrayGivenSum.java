package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class FindTwoIntInArrayGivenSum {

	public int[] twoSum(final int[] nums, final int target) {
		Map<Integer, Integer> diffToIndex = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (diffToIndex.containsKey(nums[i])) {
				return new int[]{diffToIndex.get(nums[i]), i};
			}
			diffToIndex.put(target - nums[i], i);
		}
		return new int[]{0,0};
	}
}
