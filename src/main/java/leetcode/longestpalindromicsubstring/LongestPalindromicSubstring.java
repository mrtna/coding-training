package leetcode.longestpalindromicsubstring;

public class LongestPalindromicSubstring {

	public String longestPalindrome(final String s) {
		String longestPalindrome = "";
		for (int i = 0; i < s.length(); i++) {
			String newPalindrome = getPalindromeStartingFromChar(s, i);
			if (newPalindrome.length() > longestPalindrome.length()) {
				longestPalindrome = newPalindrome;
			}
		}

		return longestPalindrome;
	}

	private String getPalindromeStartingFromChar(final String string,
												 final int startIndex) {
		String longestPalindrome = "";
		StringBuilder currentString = new StringBuilder();
		for (int j = startIndex; j < string.length(); j++) {
			currentString.append(string.charAt(j));
			if (currentString.length() > longestPalindrome.length() && isPalindrome(currentString.toString())) {
				longestPalindrome = currentString.toString();
			}
		}
		return longestPalindrome;
	}

	private boolean isPalindrome(final String string) {
		if (string.isEmpty()) {
			return false;
		}
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
}
