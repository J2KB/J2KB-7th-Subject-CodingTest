package 임수빈.programers.test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String,Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i],number[i]);
        }
        int count = 0;
        for (int i = 0; i < discount.length; i++) {
            String[] sub = Arrays.copyOfRange(discount,i,i+10);
            int count2=0;
            for(String str :want) {
                if (Collections.frequency(Arrays.asList(sub),str )>= wantMap.get(str)){
                    count2++;
                }
            }
            if(count2==want.length)count++;
        }
        return count;
    }
}