package 임수빈.programers.prob118667;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        long s1=0;long s2=0;
        for (int q : queue1) {
            q1.add(q);
            s1+=q;
        }
        Queue<Integer> q2 = new LinkedList<>();
        for (int q : queue2) {
            q2.add(q);
            s2+=q;
        }
        if((s1+s2)%2!=0){
            return -1;
        }else {
            int count=0;
            while(s1!=s2){
                if(s1>s2){
                    int n = q1.poll();
                    s1-=n;
                    q2.add(n);
                    s2+=n;
                    count++;
                }else{
                    int n = q2.poll();
                    s2-=n;
                    q1.add(n);
                    s1+=n;
                    count++;
                }
                if(count>queue1.length*2+1)return -1;
            }
            return count;
        }
    }
}