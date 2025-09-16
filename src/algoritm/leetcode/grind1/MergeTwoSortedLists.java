package algoritm.leetcode.grind1;
import java.util.Arrays;

public class MergeTwoSortedLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(0);
            ListNode tail =dummy;

            while(list1 !=null &&list2 != null) {
                if(list1.val <=list2.val) {
                    tail.next= list1;
                    list1=list1.next;
                }else {
                    tail.next=list2;
                    list2=list2.next;
                }
                tail=tail.next;
            }
            if (list1 != null) tail.next = list1;
            else tail.next = list2;

            return dummy.next;

        }
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // 재귀적으로 병합
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists2(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists2(list1, list2.next);
            return list2;
        }
    }

    public ListNode mergeTwoLists3(ListNode list1, ListNode list2) {

        // 전체 val 값 비교
        // 순서와 값 두개를 저장하기 가장 좋은 방법이 뭐가 있을까
        // 리스트 ,배열, 스택, 큐 ,map , set ,
        //1. 순서 저장하기   반복해서 리스트의 다음 노드를 탐색하며 val 값을 외우겠다.
        //3. 리스트 만들기
        // 배열에 모든 값 담기
        int[] arr = new int[200]; // 넉넉하게
        int index = 0;

        while (list1 != null) {
            arr[index++] = list1.val;
            list1 = list1.next;
        }

        while (list2 != null) {
            arr[index++] = list2.val;
            list2 = list2.next;
        }

        // 배열 정렬
        Arrays.sort(arr, 0, index);

        // 배열 → 새로운 ListNode로 변환
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int i = 0; i < index; i++) {
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }

        return dummy.next;
    }
}
