package leetcode.containsduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

	@Test
	void when_array_is_1_should_return_false() {
		int[] ints = {1};

		boolean containsDuplicate = new ContainsDuplicate().containsDuplicate(ints);

		Assertions.assertFalse(containsDuplicate);
	}

	@Test
	void when_array_is_1_1_should_return_true() {
		int[] ints = {1,1};

		boolean containsDuplicate = new ContainsDuplicate().containsDuplicate(ints);

		Assertions.assertTrue(containsDuplicate);
	}

	@Test
	void when_array_is_1_2_should_return_false() {
		int[] ints = {1,2};

		boolean containsDuplicate = new ContainsDuplicate().containsDuplicate(ints);

		Assertions.assertFalse(containsDuplicate);
	}

	@Test
	void when_array_is_1_2_1_should_return_true() {
		int[] ints = {1,2,1};

		boolean containsDuplicate = new ContainsDuplicate().containsDuplicate(ints);

		Assertions.assertTrue(containsDuplicate);
	}

}
