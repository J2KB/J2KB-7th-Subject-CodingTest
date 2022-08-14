package 임수빈.programers.prob1844;

public class Main {
    public static void main(String[] args){
        int[][]maps = {
                 {1,0,1,1,1}
                ,{1,0,1,0,1}
                ,{1,0,1,1,1}
                ,{1,1,1,0,0}
                ,{0,0,0,0,1}};
        System.out.println(new Solution().solution(maps));
    }
}
