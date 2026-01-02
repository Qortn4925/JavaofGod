package algoritm.leetcode.grind2;

import java.util.List;

public class ThreeSum15 {

    class Solution {
        // 풀이 1 ( 0의 갯수를 제한해서 생각해보기 ? ) 왜 > 0의 갯수에 따라 음수 양수를 정해야해서 ,
        public List<List<Integer>> threeSum(int[] nums) {

            // 배열에서 서치하는 방법은 달라야하는데 , n 개중 3 개를 선택할 방법은 nC3

            return null;
        }
        // 정렬해서 0을 가진 인덱스를 기억하는 배열 생성 ,
        // 0을 한개 끼고 , 음수 영역, 양수 영역 포인터를 기준으로  증가시키며 확인 ?

        // 0이 3개 통과
        // 0이 2개 불가능
        // 0이 1개 음수1 양수1 , 둘이 같아야함,
        // 0이 0개 , 음수 2 양수 1, 양수 2 음수 1
        // 이거는 합이 0을 만드는 구조에 대한거고
        public boolean checkThreeSum(int i , int j , int k) {

            return  i+j+k ==0;
        }
    }
}
