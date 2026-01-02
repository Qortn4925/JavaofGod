package algoritm.leetcode.grind3;

import java.util.*;

public class CloneGraph133 {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    // 단순 복사하기!.
    // 그래프는 추상화된 데이터 자료구조인데,
    // 보니까 리스트로 구현을 하라는것 같음. > 그렇다면 순서가 정해져 있다는건데, 이 왼쪽값이라는것과, 오른쪽 값이라는것을 어떻게 해야하나.
    // 아 각각 하나가 양 쪽 옆에 뭔가를 달고 있다고 이해하면 되는건가
    // 자 다음 고민은 그러면 ,첫 시작후 다음단계로 넘어가는 과정은 어떻게 할것인가. + 중복처리는 어떻게?
    public Node cloneGraph(Node node) {
        if(node ==null) return null;

        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            for(Node neighbor: curr.neighbors){
                if(! map.containsKey(neighbor)){
                    map.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }
}
