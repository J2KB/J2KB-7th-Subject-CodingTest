package μμλΉ.programers.prob12906;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public Integer[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int before =-1;
        for(int a:arr){
            if(before != a){
                queue.add(a);
            }
            before =a;
        }
        return queue.toArray(new Integer[0]);
    }
}