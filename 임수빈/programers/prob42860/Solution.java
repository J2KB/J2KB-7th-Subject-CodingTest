package 임수빈.programers.prob42860;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String name) {
        int size = name.length();
        char[] now = name.toCharArray();
        for (int i = 0; i < size; i++) {
            now[i]='A';
        }
        char[] dest = name.toCharArray();
        int answer = 0;
        if(now[0]!=dest[0]){
            answer+=calc(dest[0]);
            now[0]=dest[0];
        }
        int nowIndex = 0;
        while (!new String(now).contentEquals(new String(dest))){
            int[] indexValue = next(nowIndex,now,dest);
            nowIndex = indexValue[0];
            answer+=indexValue[1];
            answer+=calc(dest[nowIndex]);
        }
        return answer;
    }
    private int calc(char target){
        int dif = target - 'A';
        if(dif > 13) return 26-dif;
        else return dif;
    }
    private int[] next(int nowIndex, char[] now,char[] dest){ // 반환한 배열의 첫번째 값은 다음 인덱스, 두번재 값은 그리로 가는데 움직인 횟수
        ArrayList<Integer> needChangeIndex = new ArrayList<>();
        for (int i = 0; i < now.length; i++) {
            if(now[i]!=dest[i])needChangeIndex.add(i);
        }
        int nextIndex = nowIndex;
        int min = Integer.MAX_VALUE;
        for (int index : needChangeIndex) {
            int dif = index - nowIndex;
            if(dif<0){ // 왼쪽에 있음
                if(-dif>now.length/2){ // 오른쪽으로 가는게 빠름
                    dif = now.length + dif; // dif 가 음수이므로 더함
                }else { // 왼쪽으로 가는게 빠름
                    dif = -dif; // 부호 바꾸기
                }
            }else {//오른쪽에 있음
                if(dif>now.length/2){
                    dif = now.length - dif;
                }
            }
            if(min>dif){
                nextIndex = index;
                min = dif;
            }
        }
        now[nextIndex] = dest[nextIndex];
        return new int[]{nextIndex,min};
    }
}
// 1 2 [3] 4 5 6 7 8
