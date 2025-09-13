package algoritm.leetcode.grind2;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
             class ListNode {
   int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public class Solution {
        public boolean hasCycle(ListNode head) {



            HashSet<ListNode> listNodes = new HashSet<>();

            boolean isCycle=checkCycle(head ,listNodes);

            return isCycle;
        }

        public boolean checkCycle(ListNode head, Set<ListNode> set){

            if (head == null) return false;

            // 값이 들어간다. >cylce이 아니다  면
            if(!set.add(head) ) return true;

            return   checkCycle(head.next, set);

        }
    }
}
