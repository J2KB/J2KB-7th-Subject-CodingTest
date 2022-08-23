package 임수빈.programers.test6;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        for (int a :
                new Solution().solution(3,new int[][]{{1,2},{1,4},{2,4},{2,3},{4,3}},new int[]{1,3,5},5)) {
            System.out.println(a);
        }
    }
}
