package 임수빈.programers.prob92342;

import java.util.*;

class Solution {
    public int[] solution(int n, int[] info) {
        int[] init = new int[]{0,0,0,0,0,0,0,0,0,0,0};
        List<int[]> list = new ArrayList<>();
        list.add(init);
        list.add(new int[]{info[0]+1,0,0,0,0,0,0,0,0,0,0});
        for (int i = 1; i <11 ; i++) {
            int count = list.size();
            for (int j = 0; j < count; j++) {
                int[] arr = Arrays.copyOf(list.get(j),list.get(j).length);
                arr[i] = info[i]+1;
                if(Arrays.stream(arr).sum()<=n)
                    list.add(arr);
            }
        }
        List<int[]> filtedList = new ArrayList<>();
        for (int[] result :list) {
            int sum = 0;
            for (int i = 0; i < result.length; i++) {
                sum+=result[i];
                if(sum>n)break;
            }
            if(sum<=n){
                filtedList.add(result);
            }

        }
        Map<int[],Integer> countMap = new HashMap<>();
        List<int[]> moreFilteredList = new ArrayList<>();
        for (int[] r : filtedList) {
            int point = 0;
            int apeachPoint =0;
            for (int i = 0; i < r.length; i++) {
                if(r[i]>info[i]){
                    point+=(10-i);
                }else if (info[i]!=0){
                    apeachPoint+=(10-i);
                }
            }
            if(point>apeachPoint){
                moreFilteredList.add(r);
                countMap.put(r,point-apeachPoint);
            }
        }
        int k = 0;
        for (int[] a :
                moreFilteredList) {
            k++;
            if(a[0]==1&&a[1]==1&&a[2]==1&&a[3]==1&&a[4]==1&&a[5]==1&&a[6]==1&&a[7]==1&&a[8]==0&&a[9]==0&&a[10]==0){
                for (int b :
                        a) {
                    System.out.print(b+",");
                }
                System.out.println();
                System.out.println(k);
            }
        }
        if(moreFilteredList.isEmpty())return new int[]{-1};
        List<int[]> lastFilteredList = new ArrayList<>();
        int maxCount = countMap.values().stream().mapToInt(x->x).max().getAsInt();
        for (int[] arr : countMap.keySet()) {
            if (countMap.get(arr) == maxCount) {
                int remain = n-Arrays.stream(arr).sum();
                arr[arr.length-1]=remain;
                lastFilteredList.add(arr);
            }
        }
        if(lastFilteredList.size()==1){
            return lastFilteredList.get(0);
        }else {
           lastFilteredList.sort(new Comparator<int[]>() {
               @Override
               public int compare(int[] o1, int[] o2) {
                   for (int i = 10; i >=0; i--) {
                        if(o1[i]==o2[i])continue;
                        else if(o1[i]<o2[i]){
                            return 1;
                        }else {
                            return -1;
                        }
                   }
                   return 0;
               }
           });
           return lastFilteredList.get(0);
        }
    }
}
