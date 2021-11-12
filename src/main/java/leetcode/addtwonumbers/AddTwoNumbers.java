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
			first = getNodeOrZero(first.next);
			second = getNodeOrZero(second.next);
			listNode.next = createListNodeFromSum(first.val + second.val + getNodeOrZero(listNode.next).val);
			listNode = listNode.next;
		}
	}

	private ListNode getNodeOrZero(final ListNode node) {
		return Optional.ofNullable(node).orElseGet(listNodeZero());
	}

	private Supplier<ListNode> listNodeZero() {
		return () -> new ListNode(0);
	}

	private ListNode createListNodeFromSum(final int sum) {
		if (sum >= 10) {
			return new ListNode(sum % 10, new ListNode(1));
		} else {
			return new ListNode(sum);
		}
	}
}
