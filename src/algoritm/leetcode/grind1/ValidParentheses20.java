package algoritm.leetcode.grind1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    class Solution {
        public boolean isValid(String s) {
            if (s.length() % 2 == 1) return false;

            Map<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put(']', '[');
            map.put('}', '{');

            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (map.containsKey(c)) {
                    // 닫는 괄호 → 매칭 검사
                    if (stack.isEmpty() || stack.pop() != map.get(c)) {
                        return false;
                    }
                } else {
                    // 여는 괄호 → push
                    stack.push(c);
                }
            }

            return stack.isEmpty();
        }
    }
}
