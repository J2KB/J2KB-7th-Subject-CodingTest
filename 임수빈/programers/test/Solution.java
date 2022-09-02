package 임수빈.programers.test;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String X, String Y) {
        int[] mapX = new int[10];
        int[] mapY = new int[10];
        for(int i=0;i<10;i++){
            String[] sub = ("z"+X+"z").split(i+"");
            mapX[i] = sub.length-1;
            sub = ("z"+Y+"z").split(i+"");
            mapY[i] = sub.length-1;
        }
        int[] min = new int[10];
        for(int i=0;i<10;i++){
            if(mapX[i]<mapY[i]){
                min[i] = mapX[i];
            }else {
                min[i] = mapY[i];
            }
        }
        int count=0;
        for (int i = 1; i < 10; i++) {
            if(min[i]==0)count++;
        }
        if(count==9){
            if(min[0]!=0)
                return "0";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < min[i]; j++) {
                sb.append(i);
            }
        }
        String result = sb.reverse().toString();
        if(result.contentEquals("")){
            return "-1";
        }else{
            return result;
        }
    }
}
