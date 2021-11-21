package leetcode.longestpalindromicsubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring {

	Set<String> palindromes = new HashSet<>();
	public String longestPalindrome(final String s) {
		String longestPalindrome = "";
		for (int i = 0; i < s.length(); i++) {
			String newPalindrome = getPalindromeFromIndex(s, i);
			if (newPalindrome.length() > longestPalindrome.length()) {
				longestPalindrome = newPalindrome;
			}
		}

		return longestPalindrome;
	}

	private String getPalindromeFromIndex(final String string,
										  final int startIndex) {
		String longestPalindrome = "";
		StringBuilder currentString = new StringBuilder();
		for (int j = startIndex; j < string.length(); j++) {
			currentString.append(string.charAt(j));
			String current = currentString.toString();
			if (!palindromes.contains(current) && isPalindrome(current)) {
				palindromes.add(current);
				longestPalindrome = current;
			} else if (palindromes.contains(current)) {
				longestPalindrome = current;
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
