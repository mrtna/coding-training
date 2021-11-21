package sorting;

import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {

	@Override
	public int[] sort(final int[] ints) {
		int[] copy = Arrays.copyOf(ints, ints.length);
		boolean didSwap = true;
		while (didSwap) {
			didSwap = false;
			for (int i = 0; i < ints.length-1; i++) {
				if (copy[i+1] < copy[i]) {
					ArrayUtils.swap(copy, i, i+1);
					didSwap = true;
				}
			}
		}
		return copy;
	}
}
