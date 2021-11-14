package leetcode.mediantwosortedarray;

public class MedianTwoSortedArray {

	public double findMedian(final int[] nums1, final int[] nums2) {
		int[] mergedArray = mergeArrays(nums1, nums2);
		return medianOfArray(mergedArray);
	}

	private double medianOfArray(final int[] mergedArray) {
		if (mergedArray.length % 2 == 1) {
			return mergedArray[(mergedArray.length / 2)];
		}
		return (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2.0;
	}

	private int[] mergeArrays(final int[] nums1, final int[] nums2) {
		int[] mergedArray = new int[nums1.length + nums2.length];
		for (int i1 = 0, i2 = 0; i1 + i2 < mergedArray.length; ) {
			if (nums1.length > i1 && (nums2.length <= i2 || nums1[i1] <= nums2[i2])) {
				mergedArray[i1+i2] = nums1[i1];
				i1++;
			} else if (nums2.length > i2){
				mergedArray[i1+i2] = nums2[i2];
				i2++;
			}
		}
		return mergedArray;
	}
}
