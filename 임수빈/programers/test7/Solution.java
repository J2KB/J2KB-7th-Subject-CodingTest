package 임수빈.programers.test7;

class Solution {
    public int solution(int a, int b, int n) {
        int firstn = n;
        int count = 0;
        while (n>=a){
            int k = (n/a)*b;
            n = k + (n%a);
            count+=k;
        }
        return count;
    }
}
