package sorting;

import java.util.Arrays;

public class SelectionSort implements SortingAlgorithm {

	@Override
	public int[] sort(final int[] ints) {
		int[] sorted = Arrays.copyOf(ints, ints.length);
		for (int i = 0; i < sorted.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < sorted.length; j++) {
				if (sorted[j] < sorted[minIndex]) {
					minIndex = j;
				}
			}
			ArrayUtils.swap(sorted, i, minIndex);
		}
		return sorted;
	}

}
