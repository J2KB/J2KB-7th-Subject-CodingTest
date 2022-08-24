package 임수빈.programers.kakao2022_prob92335;
// 푸는데 걸린 시간 : 24분 : 훨씬 짧을 수 있었는데..

class Solution {
    public int solution(int n, int k) {
        int answer = -1;
        String str = Integer.toString(n,k);
        String[] strs = str.split("0");
        int count = 0;
        for(String s : strs){
            try {
                if(isPrime(Long.parseLong(s))){
                    count++;
                }
            }catch (Exception e){
                continue;
            }
        }
        return count;
    }
    public boolean isPrime(long n){
        if(n==1)return false;
        long k = (long)Math.floor(Math.sqrt(n));
        for(int i=2;i<k+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}