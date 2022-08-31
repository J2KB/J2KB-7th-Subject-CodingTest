package 임수빈.programers.test5;

import java.util.*;

class Solution {
//    public int solution(int[] topping) {
//        Set<Integer> hashSet = new HashSet<>();
//        int count = 0;
//        for (int i = 0; i <topping.length ; i++) {
//            hashSet.add(topping[i]);
//            int num1 = hashSet.size(); // 앞에 부분 토핑 개수
//            if(num1 == count(topping,i+1,topping.length).size())count++;
//        }
//        return count;
//    }
//    Set<Integer>  count(int[] arr,int start,int end){
//        Set<Integer> set = new HashSet<>();
//        for (int i = start; i <end ; i++) {
//            set.add(arr[i]);
//        }
//        return set;
//    }
    public int solution(int[] topping) {
        Map<Integer,Integer> totalToppingCount = new HashMap<>();
        Map<Integer,Integer> beforeToppingCount = new HashMap<>();
        Set<Integer> hashSet = new HashSet<>();
        for (int top : topping) {
            if(totalToppingCount.containsKey(top))
                totalToppingCount.put(top,totalToppingCount.get(top)+1);
            else
                totalToppingCount.put(top,1);
        }
        int result = 0;
        int totalCount = totalToppingCount.keySet().size();
        for (int i = 0; i <topping.length ; i++) {
            if(beforeToppingCount.containsKey(topping[i]))
                beforeToppingCount.put(topping[i],beforeToppingCount.get(topping[i])+1);
            else
                beforeToppingCount.put(topping[i],1);
            hashSet.add(topping[i]);
            int num1 = hashSet.size();
            if(totalToppingCount.containsKey(topping[i])){
                int n = totalToppingCount.get(topping[i]);
                totalToppingCount.put(topping[i],n-1);
                if(n-1==0){
                    totalCount--;
                }
            }
            if(totalCount==num1)result++;
        }
        return result;
    }
}
// 왼쪽 파트의 토핑개수 = 인덱스가 1 적은 곧에서 자른 녀석 + 1
// 오른쪽 파트 의 토핑개수 = 인덱스가 1 많은 곳에서 자른 녀석 +1
