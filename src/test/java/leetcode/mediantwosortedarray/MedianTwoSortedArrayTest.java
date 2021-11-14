package leetcode.mediantwosortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianTwoSortedArrayTest {

	@Test
	void findMedian_nothing_and_zero_should_return_zero() {
		int[] nums1 = {}, nums2 = {0};
		double expected = 0;

		double median = new MedianTwoSortedArray().findMedian(nums1, nums2);

		Assertions.assertEquals(expected, median);
	}

	@Test
	void findMedian_nothing_and_one_should_return_one() {
		int[] nums1 = {}, nums2 = {1};
		double expected = 1;

		double median = new MedianTwoSortedArray().findMedian(nums1, nums2);

		Assertions.assertEquals(expected, median);
	}

	@Test
	void findMedian_one_and_nothing_should_return_one() {
		int[] nums1 = {1}, nums2 = {};
		double expected = 1;

		double median = new MedianTwoSortedArray().findMedian(nums1, nums2);

		Assertions.assertEquals(expected, median);
	}

	@Test
	void findMedian_one_and_two_should_return_one_point_five() {
		int[] nums1 = {1}, nums2 = {2};
		double expected = 1.5;

		double median = new MedianTwoSortedArray().findMedian(nums1, nums2);

		Assertions.assertEquals(expected, median);
	}

	@Test
	void findMedian_one_two_and_three_four_should_return_two_point_five() {
		int[] nums1 = {1,2}, nums2 = {3,4};
		double expected = 2.5;

		double median = new MedianTwoSortedArray().findMedian(nums1, nums2);

		Assertions.assertEquals(expected, median);
	}

	@Test
	void findMedian_three_four_and_one_two_should_return_two_point_five() {
		int[] nums1 = {3,4}, nums2 = {1,2};
		double expected = 2.5;

		double median = new MedianTwoSortedArray().findMedian(nums1, nums2);

		Assertions.assertEquals(expected, median);
	}

	@Test
	void findMedian_one_and_two_three_should_return_two() {
		int[] nums1 = {1}, nums2 = {2,3};
		double expected = 2;

		double median = new MedianTwoSortedArray().findMedian(nums1, nums2);

		Assertions.assertEquals(expected, median);
	}

	@Test
	void findMedian_one_two_three_four_and_five_seven_eight_nine_should_return_four_point_five() {
		int[] nums1 = {1,2,3,4}, nums2 = {5,7,8,9};
		double expected = 4.5;

		double median = new MedianTwoSortedArray().findMedian(nums1, nums2);

		Assertions.assertEquals(expected, median);
	}

}
