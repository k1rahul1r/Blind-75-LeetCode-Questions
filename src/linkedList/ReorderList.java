package linkedList;
//https://leetcode.com/problems/reorder-list/
public class ReorderList {
	 public void reorderList(ListNode head) {
	        if(head==null || head.next==null)
	            return;
	        
	        ListNode l1 = head;//1
	        ListNode slow = head;//1
	        ListNode fast = head;//1
	        ListNode prev = null;
	        
	        while(fast!=null && fast.next!=null){
	            prev=slow;            //1,2,3,4
	            slow=slow.next;       //2,3,4,5
	            fast=fast.next.next;  //3,5,7,null
	        }
	        ListNode l2 = reverseList(slow);
	        prev.next=null;
	        merge(l1,l2);
	    }
	    
	    public ListNode reverseList(ListNode head){
	        ListNode prev = null;
	        
	        while(head!=null){
	            ListNode nextNode = head.next;
	            head.next=prev;
	            prev=head;
	            head=nextNode;
	        }
	        return prev;
	    }
	    
	    public void merge(ListNode l1, ListNode l2){
	        while(l1!=null){
	            ListNode l1Next = l1.next;
	            ListNode l2Next = l2.next;
	            l1.next=l2;
	            if(l1Next==null)
	                break;
	            
	            l2.next=l1Next;
	            l1=l1Next;
	            l2=l2Next;
	        }
	    }
}
