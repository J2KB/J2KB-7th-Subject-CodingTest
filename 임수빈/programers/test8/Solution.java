package 임수빈.programers.test8;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//64.7
class Solution {
    public int solution(int[] ingredient) {
        List<Integer> list = new ArrayList<>();
        for (int i :
                ingredient) {
            list.add(i);
        }
        int count=0;
        aaa: while (true){
            for (int i = 0; ; i++) {
                try {
                    if(list.get(i)==1&&list.get(i+1)==2&&list.get(i+2)==3&&list.get(i+3)==1){
                        list.remove(i);list.remove(i);list.remove(i);list.remove(i);
                        break;
                    }
                }catch (Exception e){
                    break aaa;
                }
            }
            count++;
            if(list.size()<4){
                break;
            }else if(list.size()==4){
                int i=0;
                if(list.get(i)==1&&list.get(i+1)==2&&list.get(i+2)==3&&list.get(i+3)==1){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}