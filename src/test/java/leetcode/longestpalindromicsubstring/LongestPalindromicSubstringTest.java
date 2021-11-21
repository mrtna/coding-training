package leetcode.longestpalindromicsubstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {

	@Test
	void longestPalindrome_a_returns_a() {
		String str = "a";
		String expectedPalindrome = "a";

		String palindrome = new LongestPalindromicSubstring().longestPalindrome(str);

		Assertions.assertEquals(expectedPalindrome, palindrome);
	}

	@Test
	void longestPalindrome_b_returns_b() {
		String str = "b";
		String expectedPalindrome = "b";

		String palindrome = new LongestPalindromicSubstring().longestPalindrome(str);

		Assertions.assertEquals(expectedPalindrome, palindrome);
	}

	@Test
	void longestPalindrome_ab_returns_a() {
		String str = "ab";
		String expectedPalindrome = "a";

		String palindrome = new LongestPalindromicSubstring().longestPalindrome(str);

		Assertions.assertEquals(expectedPalindrome, palindrome);
	}

	@Test
	void longestPalindrome_aba_returns_aba() {
		String str = "aba";
		String expectedPalindrome = "aba";

		String palindrome = new LongestPalindromicSubstring().longestPalindrome(str);

		Assertions.assertEquals(expectedPalindrome, palindrome);
	}

	@Test
	void longestPalindrome_cbbd_returns_bb() {
		String str = "cbbd";
		String expectedPalindrome = "bb";

		String palindrome = new LongestPalindromicSubstring().longestPalindrome(str);

		Assertions.assertEquals(expectedPalindrome, palindrome);
	}

	@Test
	void random() {
		String str = "lphntrsqudccteewsdmpjmgmfnxegawjclzobpnxdrvxeygafiwyqsvsecictqkmiqvrdjajfngvlhdezdpqpzjjzbhoyggrbkuzeocrpzqishvfairdvvabopyubfisxbrgnlughbrzunitwowvnsqhdtnkotitgxwzjhbgltksorygpdberdgzgvogrvwluhixfbrfhliedjylxuspjpitwlhdkneonreqrueqphirmgxtqumllqropaefddplspkrtkbmuvwkyryworojlvwzdlacuoqzokrmcgmwkopsbqjjkaoqjqbrderwzmhbhfgwvrjakyfeqcbtvlcgbsxkngymxyievihiskdmmppmmdksihiveiyxmygnkxsbgclvtbcqefykajrvwgfhbhmzwredrbqjqoakjjqbspokwmgcmrkozqoucaldzwvljorowyrykwvumbktrkpslpddfeaporqllmuqtxgmrihpqeurqernoenkdhlwtipjpsuxlyjdeilhfrbfxihulwvrgovgzgdrebdpgyrosktlgbhjzwxgtitokntdhqsnvwowtinuzrbhgulngrbxsifbuypobavvdriafvhsiqzprcoezukbrggyohbzjjzpqpdzedhlvgnfjajdrvqimkqtcicesvsqywifagyexvrdxnpbozlcjwagexnfmgmjpmdsweetccduqsrtnhpl";
		String expectedPalindrome = "bb";

		String palindrome = new LongestPalindromicSubstring().longestPalindrome(str);

		Assertions.assertEquals(expectedPalindrome, palindrome);
	}

}
