package algoritm.leetcode.grind3;

import java.util.HashMap;

public class CourseSchedule207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int [] arr: prerequisites){
            if(map.get(arr[0]).equals(map.get(arr[1]))) return false;


            map.put(arr[0],arr[1]);
        }

        return  true;
    }
}
