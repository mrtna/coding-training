package leetcode.addtwonumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

	@Test
	void addTwoNumbers_0_0_should_return_0() {
		ListNode first = new ListNode(0);
		ListNode second = new ListNode(0);

		ListNode node = new AddTwoNumbers().addTwoNumbers(first, second);

		Assertions.assertEquals(new ListNode(0), node);
	}

	@Test
	void addTwoNumber_0_5_should_return_5() {
		ListNode first = new ListNode(0);
		ListNode second = new ListNode(5);

		ListNode node = new AddTwoNumbers().addTwoNumbers(first, second);

		Assertions.assertEquals(new ListNode(5), node);

	}

	@Test
	void addTwoNumber_5_5_should_return_01() {
		ListNode first = new ListNode(5);
		ListNode second = new ListNode(5);

		ListNode node = new AddTwoNumbers().addTwoNumbers(first, second);

		ListNode expected = new ListNode(0, new ListNode(1));
		Assertions.assertEquals(expected, node);
	}

	@Test
	void addTwoNumber_44_33_should_return_7() {
		ListNode first = new ListNode(4,new ListNode(4));
		ListNode second = new ListNode(3, new ListNode(3));

		ListNode node = new AddTwoNumbers().addTwoNumbers(first, second);

		ListNode expected = new ListNode(7, new ListNode(7));
		Assertions.assertEquals(expected, node);
	}

	@Test
	void addTwoNumber_55_55_should_return_011() {
		ListNode first = new ListNode(5, new ListNode(5));
		ListNode second = new ListNode(5, new ListNode(5));

		ListNode node = new AddTwoNumbers().addTwoNumbers(first, second);

		ListNode expected = new ListNode(0, new ListNode(1, new ListNode(1)));
		Assertions.assertEquals(expected, node);
	}

	@Test
	void addTwoNumber_555_55_should_return_016() {
		ListNode first = new ListNode(5, new ListNode(5, new ListNode(5)));
		ListNode second = new ListNode(5, new ListNode(5));

		ListNode node = new AddTwoNumbers().addTwoNumbers(first, second);

		ListNode expected = new ListNode(0, new ListNode(1, new ListNode(6)));
		Assertions.assertEquals(expected, node);
	}

	@Test
	void addTwoNumber_9999999_9999_should_return_89990001() {
		ListNode first = new ListNode(9, new ListNode(9, new ListNode(9,new  ListNode(9, new ListNode(9, new  ListNode(9, new ListNode(9)))))));
		ListNode second = new ListNode(9, new ListNode(9, new  ListNode(9, new ListNode(9))));

		ListNode node = new AddTwoNumbers().addTwoNumbers(first, second);

		ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9,new  ListNode(9, new ListNode(0, new  ListNode(0, new ListNode(0, new ListNode(1))))))));
		Assertions.assertEquals(expected, node);
	}

}
