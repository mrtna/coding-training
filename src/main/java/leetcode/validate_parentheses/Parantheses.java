package leetcode.validate_parentheses;

import java.util.List;

public class Parantheses {

	private static final String OPEN_CLOSE_PARANTHESES = "()";
	private static final String OPEN_CLOSE_CURLY_BRACKETS = "{}";
	private static final String OPEN_CLOSE_SQUARE_BRACKETS = "[]";
	private static final List<String> OPEN_CLOSE_LIST = List.of(OPEN_CLOSE_PARANTHESES, OPEN_CLOSE_CURLY_BRACKETS, OPEN_CLOSE_SQUARE_BRACKETS);

	private static final String OPEN_CLOSE_PARANTHESES_REGEX = "\\(\\)";
	private static final String OPEN_CLOSE_BRACKETS_REGEX = "\\{}";
	private static final String OPEN_CLOSE_SQUARE_BRACKETS_REGEX = "\\[\\]";
	private static final List<String> OPEN_CLOSE_REGEX_LIST = List.of(OPEN_CLOSE_PARANTHESES_REGEX,
																	  OPEN_CLOSE_BRACKETS_REGEX,
																	  OPEN_CLOSE_SQUARE_BRACKETS_REGEX);
	private static final String EMPTY = "";

	public boolean isValid(final String str) {
		String temp = str;
		while (containsOpenClose(temp)) {
			temp = removeAll(temp);
		}
		return temp.isBlank();
	}

	private boolean containsOpenClose(final String temp) {
		return OPEN_CLOSE_LIST.stream().anyMatch(temp::contains);
	}

	private String removeAll(String temp) {
		String t = temp;
		for (String regex: OPEN_CLOSE_REGEX_LIST) {
			t = t.replaceAll(regex, EMPTY);
		}
		return t;
	}
}
