package sorting;

public final class ArrayUtils {

	private ArrayUtils() {
		// utility class
	}


	public static void swap(final int[] array, final int i, final int minIndex) {
		int iValue = array[i];
		int minValue = array[minIndex];
		array[i] = minValue;
		array[minIndex] = iValue;
	}
}
