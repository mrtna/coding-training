package sorting;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SortingTest {

	private static final SelectionSort SELECTION_SORT = new SelectionSort();
	private static final BubbleSort BUBBLE_SORT = new BubbleSort();

	@ParameterizedTest
	@MethodSource
//	@Disabled
	void test_sort_n_numbers(final int numberOfInts, final SortingAlgorithm sortingAlgorithm) {
		int[] ints = new int[numberOfInts];
		for (int i = 0; i < numberOfInts; i++) {
			ints[i] = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
		}

		int[] sorted = sortingAlgorithm.sort(ints);
		Assertions.assertTrue(isSorted(sorted));
		Assertions.assertEquals(sorted.length, ints.length);
	}

	private static Stream<Arguments> test_sort_n_numbers() {
		return Stream.of(
				Arguments.of(5, SELECTION_SORT),
				Arguments.of(50, SELECTION_SORT),
				Arguments.of(500, SELECTION_SORT),
				Arguments.of(50000, SELECTION_SORT),
				Arguments.of(5, BUBBLE_SORT),
				Arguments.of(50, BUBBLE_SORT),
				Arguments.of(500, BUBBLE_SORT),
				Arguments.of(50000, BUBBLE_SORT)
		);
	}

	private boolean isSorted(int[] ints) {
		for (int i = 0; i < ints.length - 1; i++) {
			if (ints[i+1] < ints[i]) {
				return false;
			}
		}
		return true;
	}
}
