package 임수빈.programers.prob42583;

class Main {
    public static void main(String[] args){
        int bridge_length=100;
        int weight = 100;
        int[] truck_weights= new int[]{10,10,10,10,10,10,10,10,10,10};
        System.out.println(new Solution().solution(bridge_length,weight,truck_weights));
    }
}
