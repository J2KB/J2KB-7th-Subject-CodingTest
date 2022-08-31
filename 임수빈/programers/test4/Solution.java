package 임수빈.programers.test4;

class Solution {
    public int solution(int[] number) {
        int count=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if(i==j)continue;
                for (int k = 0; k < number.length; k++) {
                    if(i==k || j==k) continue;
                    if(number[i]+number[j]+number[k]==0){
                        count++;
                    }
                }
            }
        }
        return count/6;
    }
}