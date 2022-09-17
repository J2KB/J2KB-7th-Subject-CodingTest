package 임수빈.programers.prob92342;

public class Main {
    public static void main(String[] args) {
        //int[] result = new Solution().solution(10, new int[]{0,0,0,0,0,0,0,0,3,4,3});
        //int[] result = new Solution().solution(9, new int[]{0,0,1,2,0,1,1,1,1,1,1});
        int[] result = new Solution().solution(5, new int[]{2,1,1,1,0,0,0,0,0,0,0});

        for (int r :
                result) {
            System.out.println(r);
        }
    }
}
