package 임수빈.programers.prob42860;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String name) {
        int size = name.length();
        char[] now = name.toCharArray();
        for (int i = 0; i < size; i++) {
            now[i]='A';
        }
        char[] dest = name.toCharArray();
        boolean[] needChange = new boolean[size];
        for (int i = 0; i < size; i++) {
            if(now[i]!=dest[i])needChange[i]=true;
        }
        int a = 0;
        if(needChange[0]){
            a = calc(dest[0]);
            needChange[0]=false;
        }
        return a+fun(0,needChange,dest);
    }

    private int fun(int now, boolean[] needChange,char[] dest){
        boolean[] needChangeLeft = needChange.clone();
        boolean[] needChangeRight = needChange.clone();
        int count=0;
        for (boolean b : needChange) {
            if(b){
                count++;
                break;
            }
        }
        if (count==0)return 0;

        int leftCount =0;
        int i = now;
        for (;;) {
            if(i==0){
                leftCount++;
                i = needChangeLeft.length-1;
            }else {
                leftCount++;
                i--;
            }
            if(needChange[i]){
                leftCount += calc(dest[i]);
                needChangeLeft[i]=false;
                break;
            }
        }
        int goLeft = leftCount + fun(i,needChangeLeft.clone(),dest);
        i = now;
        int rightCount =0;
        if(needChange[now] && now==0){
            rightCount += calc(dest[0]);
            needChange[now] = false;
        }
        for (;;) {
            if(i==needChange.length-1){
                rightCount++;
                i = 0;
            }else {
                rightCount++;
                i++;
            }
            if(needChange[i]){
                rightCount += calc(dest[i]);
                needChangeRight[i]=false;
                break;
            }
        }
        int goRight = rightCount + fun(i,needChangeRight.clone(),dest);
        return Math.min(goRight,goLeft);
    }
    private int calc(char target){
        int dif = target - 'A';
        if(dif > 13) return 26-dif;
        else return dif;
    }
}
// 1 2 [3] 4 5 6 7 8
