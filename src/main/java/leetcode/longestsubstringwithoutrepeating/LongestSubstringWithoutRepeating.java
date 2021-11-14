package leetcode.longestsubstringwithoutrepeating;

public class LongestSubstringWithoutRepeating {

	public int getLength(final String s) {
		int maxCount = 0;
		char[] chars = s.toCharArray();
		StringBuilder currentString = new StringBuilder();

		for (char aChar : chars) {
			currentString = appendChar(currentString, aChar);
			maxCount = Math.max(currentString.length(), maxCount);
		}

		return maxCount;
	}

	private StringBuilder appendChar(StringBuilder currentString, final char aChar) {
		String charString = String.valueOf(aChar);
		if (currentString.isEmpty() || !currentString.toString().contains(charString)) {
			currentString.append(aChar);
		} else {
			currentString = appendAndClear(currentString, aChar, charString);
		}
		return currentString;
	}

	private StringBuilder appendAndClear(StringBuilder currentString, final char aChar, final String charString) {
		currentString.append(aChar);
		currentString = clearFromChar(currentString, charString);
		return currentString;
	}

	private StringBuilder clearFromChar(StringBuilder currentString, final String charString) {
		currentString = new StringBuilder(currentString.substring(currentString.indexOf(charString)+1));
		return currentString;
	}
}
