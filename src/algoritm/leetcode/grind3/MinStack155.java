package algoritm.leetcode.grind3;

import java.util.ArrayList;
import java.util.Stack;

 class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    int top=0;
     Stack<Integer> minList =new Stack<Integer>();
    public MinStack() {

    }

    public void push(int val) {
        // 1. 메인 스택에 값 추가
        list.add(val);

        // 2. 보조 스택(minList)에 넣을 최솟값 결정
        if (minList.isEmpty()) {
            // 첫 데이터라면 자기 자신이 최솟값
            minList.add(val);
        } else {
            // 현재 최솟값(minList의 마지막 값)과 새 값을 비교해서 더 작은 걸 추가
            int currentMin = minList.get(minList.size() - 1);
            minList.add(Math.min(currentMin, val));
        }

    }

    public void pop() {
    int k = list.remove(top);
    top--;
    minList.pop();
    }

    public int top() {
        return list.get(top);
    }
    // O(1) , 리스트를 탐색하지 않고 바로 반환하려면 항시 그 값을 기억해야한다.
    // 그렇다면 값이 추가되고 빠질때마다 MIN 이라는 값을 관리하는 컬럼을 추가???
    // 해보니까 배열은 스왑하는데 시간이 걸림, 그렇다면 작은값들만 관리하는 연결리스트의 구현? 자원하나 추가?
    public int getMin() {
    return minList.get(minList.size()-1);
    }
}
