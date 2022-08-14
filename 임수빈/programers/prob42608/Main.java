package 임수빈.programers.prob42608;

public class Main {
    public static void main(String[] args){
        int[] arr =new Solution().solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});
        for(int a :arr){
            System.out.println(a);
        }
        arr =new Solution().solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
        for(int a :arr){
            System.out.println(a);
        }
    }
}
