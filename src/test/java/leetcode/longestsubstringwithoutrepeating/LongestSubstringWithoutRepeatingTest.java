package leetcode.longestsubstringwithoutrepeating;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingTest {

	@Test
	void empty_should_return_0() {
		Assertions.assertEquals(0, new LongestSubstringWithoutRepeating().getLength(""));
	}

	@Test
	void a_should_return_1() {
		Assertions.assertEquals(1, new LongestSubstringWithoutRepeating().getLength("a"));
	}

	@Test
	void ab_should_return_2() {
		Assertions.assertEquals(2, new LongestSubstringWithoutRepeating().getLength("ab"));
	}

	@Test
	void aa_should_return_1() {
		Assertions.assertEquals(1, new LongestSubstringWithoutRepeating().getLength("aa"));
	}

	@Test
	void abcabcbb_should_return_3() {
		Assertions.assertEquals(3, new LongestSubstringWithoutRepeating().getLength("abcabcbb"));
	}

	@Test
	void pwwkew_should_return_3() {
		Assertions.assertEquals(3, new LongestSubstringWithoutRepeating().getLength("pwwkew"));
	}

}
