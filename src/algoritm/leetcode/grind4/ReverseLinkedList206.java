package algoritm.leetcode.grind4;

public class ReverseLinkedList206 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {

        ListNode prev= null;
        ListNode curr= head;

        while(curr!=null) {
            //1. 다음 주소 기억, 2 현재 노드 과거로 이동, 3.현재 노드 다음 노도르, 4 과거 노드도 한칸 옮기기
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
