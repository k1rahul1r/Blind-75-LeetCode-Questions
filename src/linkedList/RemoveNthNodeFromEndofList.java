package linkedList;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode fast = temp;
		ListNode slow = temp;

		for (int i = 1; i <= n + 1; ++i) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;

		return temp.next;
	}
}
