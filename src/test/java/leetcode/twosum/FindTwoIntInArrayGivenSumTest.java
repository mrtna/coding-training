package leetcode.twosum;

import leetcode.twosum.FindTwoIntInArrayGivenSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTwoIntInArrayGivenSumTest {

	@Test
	void twoSum_should_return_0_and_1() {
		int[] nums = {1, 2};
		int target = 3;

		int[] indexes = new FindTwoIntInArrayGivenSum().twoSum(nums, target);
		Assertions.assertEquals(0, indexes[0]);
		Assertions.assertEquals(1, indexes[1]);
	}

	@Test
	void twoSum_should_return_0_and_2() {
		int[] nums = {1, 2, 3};
		int target = 4;

		int[] indexes = new FindTwoIntInArrayGivenSum().twoSum(nums, target);
		Assertions.assertEquals(0, indexes[0]);
		Assertions.assertEquals(2, indexes[1]);
	}

	@Test
	void twoSum_should_return_0_and_2_27_plus_33() {
		int[] nums = {27, 4, 33};
		int target = 60;

		int[] indexes = new FindTwoIntInArrayGivenSum().twoSum(nums, target);
		Assertions.assertEquals(0, indexes[0]);
		Assertions.assertEquals(2, indexes[1]);
	}

	@Test
	void twoSum_should_return_1_and_2_when_target_is_negative() {
		int[] nums = {10, 70, -175};
		int target = -105;

		int[] indexes = new FindTwoIntInArrayGivenSum().twoSum(nums, target);
		Assertions.assertEquals(1, indexes[0]);
		Assertions.assertEquals(2, indexes[1]);
	}

}
