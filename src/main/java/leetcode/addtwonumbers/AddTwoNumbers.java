package leetcode.addtwonumbers;

import java.util.Optional;
import java.util.function.Supplier;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(final ListNode first, final ListNode second) {
		return add(first, second);
	}

	private ListNode add(ListNode first, ListNode second) {
		ListNode listNode = createListNodeFromSum(first.val + second.val);
		addNextListNodes(first, second, listNode);
		return listNode;
	}

	private void addNextListNodes(ListNode first, ListNode second, ListNode listNode) {
		while (first.next != null || second.next != null) {
			first = Optional.ofNullable(first.next).orElseGet(listNodeZero());
			second = Optional.ofNullable(second.next).orElseGet(listNodeZero());
			listNode.next = createListNodeFromSum(first.val + second.val + Optional.ofNullable(listNode.next).orElseGet(
					listNodeZero()).val);
			listNode = listNode.next;
		}
	}

	private Supplier<ListNode> listNodeZero() {
		return () -> new ListNode(0);
	}

	private ListNode createListNodeFromSum(final int sum) {
		ListNode listNode;
		boolean addOneToNext = sum >= 10;
		if (addOneToNext) {
			listNode = new ListNode(sum % 10, new ListNode(1));
		} else {
			listNode = new ListNode(sum);
		}
		return listNode;
	}
}
