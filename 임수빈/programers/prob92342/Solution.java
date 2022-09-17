package 임수빈.programers.prob92342;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

class Solution {
    public int[] solution(int n, int[] info) {
        boolean[] init = new boolean[11];
        List<boolean[]> list = new ArrayList<>();
        Map<boolean[],Integer> pointMap = new HashMap<>();
        list.add(init);
        boolean[] init2 = new boolean[]{true,false,false,false,false,false,false,false,false,false,false};
        list.add(init2);
        pointMap.put(init,0);
        pointMap.put(init2,10);
        for (int i = 1; i <11 ; i++) {
            int count = list.size();
            for (int j = 0; j < count; j++) {
                boolean[] arr = Arrays.copyOf(list.get(j),list.get(j).length);
                arr[i] = true;
                list.add(arr);
                int point = 0;
                for (int k = 0; k < arr.length; k++) {
                    if(arr[k])
                        point+=10-k;
                }
                pointMap.put(arr,point);
            }
        }
        List<int[]> result1 = new ArrayList<>();
        Map<int[],boolean[]> intBooleanMap = new HashMap<>();
        for (boolean[] key : pointMap.keySet()) {
            int[] arrows = new int[11];
            for (int i = 0; i < 11; i++) {
                if(key[i]){
                    arrows[i]=info[i]+1;
                }
            }
            // 어피치보다 하나식 더 맞춤.
            if(Arrays.stream(arrows).sum()>n){ // 불가능한 경우

            }else if(Arrays.stream(arrows).sum()<n) { // 화살을 더 쏴야 하는 경우 = x,x,x,x,x,x, ... 0
//                if(arrows[8]==0&&arrows[9]==0&&arrows[10]==0){
//                    for (int i : arrows) {
//                        System.out.print(i+",");
//                    }
//                    System.out.println();
//                }
                result1.add(arrows);
                intBooleanMap.put(arrows,key);
            }else{ // 화살 개수가 알맞은 경우 = 가능한 경우
                result1.add(arrows);
                intBooleanMap.put(arrows,key);
            }
        }
        Map<boolean[],Integer> pointMap2 = new HashMap<>();
        for (int[] arrows : result1) {
            pointMap2.put(intBooleanMap.get(arrows),pointMap.get(intBooleanMap.get(arrows)));
        }
        int maxPoint = 0;
        for (int m : pointMap2.values()) {
            if(maxPoint<m)maxPoint = m;
        }
        List<int[]> results = new ArrayList<>();
        for (int[] key :
                intBooleanMap.keySet()) {
            if(maxPoint == pointMap2.get(intBooleanMap.get(key))){
                results.add(key);
            }
        }
        for (int i = 0; i < results.size(); i++) {
            int[] arr = results.get(i);
            int remain = n - Arrays.stream(arr).sum();
            arr[arr.length-1]= remain;
        }
        return results.get(0);

//        int[] init = new int[]{0,0,0,0,0,0,0,0,0,0,0};
//        List<int[]> list = new ArrayList<>();
//        list.add(init);
//        list.add(new int[]{info[0]+1,0,0,0,0,0,0,0,0,0,0});
//        for (int i = 1; i <11 ; i++) {
//            int count = list.size();
//            for (int j = 0; j < count; j++) {
//                int[] arr = Arrays.copyOf(list.get(j),list.get(j).length);
//                arr[i] = info[i]+1;
//                list.add(arr);
//            }
//        }
//        List<int[]> filtedList = new ArrayList<>();
//        for (int[] result :list) {
//            int sum = 0;
//            for (int i = 0; i < result.length; i++) {
//                sum+=result[i];
//                if(sum>n)break;
//            }
//            if(sum==n){
//                filtedList.add(result);
//            }
//
//        }
//        Map<int[],Integer> countMap = new HashMap<>();
//        List<int[]> moreFilteredList = new ArrayList<>();
//        for (int[] r : filtedList) {
//            int point = 0;
//            int apeachPoint =0;
//            for (int i = 0; i < r.length; i++) {
//                if(r[i]>info[i]){
//                    point+=(10-i);
//                }else if (info[i]!=0){
//                    apeachPoint+=(10-i);
//                }
//            }
//            if(point>apeachPoint){
//                moreFilteredList.add(r);
//                countMap.put(r,point-apeachPoint);
//            }
//        }
//        System.out.println(filtedList);
//        if(moreFilteredList.isEmpty())return new int[]{-1};
//        List<int[]> lastFilteredList = new ArrayList<>();
//        int maxCount = countMap.values().stream().mapToInt(x->x).max().getAsInt();
//        for (int[] arr : countMap.keySet()) {
//            if (countMap.get(arr) == maxCount) {
//                lastFilteredList.add(arr);
//            }
//        }
//        if(lastFilteredList.size()==1){
//            return lastFilteredList.get(0);
//        }else {
//            Map<String,int[]> finalMap = new HashMap<>();
//            List<String> strings = new ArrayList<>();
//            for (int[] r : lastFilteredList) {
//                StringBuilder stringBuilder = new StringBuilder();
//                for (int a : r) {
//                    stringBuilder.append(a);
//                }
//                String s = stringBuilder.toString();
//                finalMap.put(s,r);
//                strings.add(s);
//            }
//            Collections.sort(strings);
//            return finalMap.get(strings.get(0));
//        }
    }
}
