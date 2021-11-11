package leetcode.validate_parentheses;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ParanthesesTest {

	@Test
	void parantheses_open_and_close_should_be_valid() {
		Assertions.assertTrue(new Parantheses().isValid("()"));
	}

	@Test
	void parantheses_close_and_open_should_not_be_valid() {
		Assertions.assertFalse(new Parantheses().isValid(")("));
	}

	@Test
	void parantheses_open_open_close_close_should_be_valid() {
		Assertions.assertTrue(new Parantheses().isValid("(())"));
	}

	@Test
	void parantheses_open_close_open_close_should_be_valid() {
		Assertions.assertTrue(new Parantheses().isValid("()()"));
	}

	@Test
	void curly_brackets_open_and_close_should_be_valid() {
		Assertions.assertTrue(new Parantheses().isValid("{}"));
	}

	@Test
	void curly_brackets_close_and_open_should_not_be_valid() {
		Assertions.assertFalse(new Parantheses().isValid("}{"));
	}

	@Test
	void square_brackets_open_and_close_should_be_valid() {
		Assertions.assertTrue(new Parantheses().isValid("[]"));
	}

	@ParameterizedTest
	@MethodSource
	void a_combination_of_all_valid_should_be_valid(final String s) {
		Assertions.assertTrue(new Parantheses().isValid(s));
	}

	private static Stream<Arguments> a_combination_of_all_valid_should_be_valid() {
		return Stream.of(
				Arguments.of("[](){}"),
				Arguments.of("{([])}"),
				Arguments.of("{{{()[[]]}}}([])")
		);
	}
}
