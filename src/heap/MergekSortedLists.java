package heap;

//https://leetcode.com/problems/merge-k-sorted-lists/
public class MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (ListNode head : lists) {
			while (head != null) {
				pq.add(head.val);
				head = head.next;
			}
		}

		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while (!pq.isEmpty()) {
			head.next = new ListNode(pq.remove());
			head = head.next;
		}

		return dummy.next;
	}
}
