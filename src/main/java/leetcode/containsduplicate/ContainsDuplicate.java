package leetcode.containsduplicate;

import java.util.Arrays;

public class ContainsDuplicate {

	public boolean containsDuplicate(final int[] ints) {
		int[] intsToCheck = Arrays.stream(ints).sorted().toArray();
		for (int i = 0; i < intsToCheck.length - 1; i++) {
			if (intsToCheck[i] == intsToCheck[i+1]) {
				return true;
			}
		}
		return false;
	}
}
