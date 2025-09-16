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

        //카운터 방식,, 가장 최근과 매칭되는 닫는게 필요해서 안됨.
        public static  boolean isValid2(String s) {
            int round = 0, square = 0, curly = 0;

            // round , squer, curly
            for(char a:s.toCharArray()) {
                switch (a) {
                    case '(':
                        round++;
                        break;
                    case ')' :
                        round--;
                        break;
                    case '{':
                        curly++;
                        break;
                    case '}':
                        curly--;
                        break;
                    case '[':
                        square++;
                        break;
                    case ']':
                        square--;
                        break;
                }
                if(round<0 || curly <0 || square<0) {
                    return false;
                }
                System.out.println("round = " + round+" squere = "+square+" culry ="+curly);
            }

//            if(round+square+curly>0) return  false;
//            else  return  true;

//            if((round + square + curly) == 0) return true;
//            else return false;
            if(round==0&square==0&&curly==0) return  true;
            else  return false;
        }

        public static  boolean isValid3(String s) {

            if(s.length() %2==1) return false;

            if(s.isEmpty()) return  true;


        }

    }
    public static void main(String[] args) {
        String s ="()";
        System.out.println("isValid2 = " + Solution.isValid2(s));
    }
}
