package leetcode.longestsubstringwithoutrepeating;

public class LongestSubstringWithoutRepeating {

	public int getLength(final String s) {
		int maxCount = 0;
		char[] chars = s.toCharArray();
		StringBuilder currentString = new StringBuilder();

		for (char aChar : chars) {
			if (currentString.isEmpty() || !currentString.toString().contains(""+aChar)) {
				currentString.append(aChar);
			} else {
				currentString = new StringBuilder();
			}
			maxCount = Math.max(currentString.length(), maxCount);
		}

		return maxCount;
	}
}
