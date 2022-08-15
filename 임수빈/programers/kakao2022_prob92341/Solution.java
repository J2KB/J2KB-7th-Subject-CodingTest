package 임수빈.programers.kakao2022_prob92341;

import java.sql.Time;
import java.util.*;

// 푸는데 걸린 시간 : 60분
class Solution {
    public Integer[] solution(int[] fees, String[] records) {
        Map<String, Queue<Record>> map = new HashMap<>();
        Map<String, Integer> feeMap = new HashMap<>();
        for (String r : records) {
            Record record = new Record(r);
            if (map.containsKey(record.index)) {
                map.get(record.index).add(record);
            } else {
                Queue<Record> stack = new LinkedList<>();
                stack.add(record);
                map.put(record.index, stack);
            }
        }
        Set<String> keyset = map.keySet();
        for(String key: keyset){
            Queue<Record> queue = map.get(key);
            int count =0;
            int before=0;
            while(queue.size()>1){
                Record record = queue.poll();
                if(record.what.contentEquals("IN")){
                    before = record.time;
                }else{
                    count+= record.time-before;
                }
            }
            Record record =queue.poll();
            if(record.what.contentEquals("IN")){
                before = record.time;
                count+= (23*60+59 - before);
            }else{
                count+= record.time-before;
            }
            if(count<=fees[0]){
                feeMap.put(key,fees[1]);
            }else {
                int fee = count-fees[0];
                fee = fee / fees[2];
                if((count-fees[0]) %fees[2]!=0){
                    fee+=1;
                }
                fee = fee * fees[3];
                fee +=fees[1];
                feeMap.put(key,fee);
            }
        }
        List<Integer> list = new ArrayList<>();
        List<String> keylist = new ArrayList<>(keyset);
        Collections.sort(keylist);
        for (String key :
                keylist) {
            list.add(feeMap.get(key) );
        }
        return list.toArray(new Integer[list.size()]);
    }
}
class Record implements Comparable<Record>{
    int time;
    String index;
    String what;
    public Record(String str){
        String[] strs = str.split(" ");
        String[] times = strs[0].split(":");
        time = Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
        index = strs[1];
        what = strs[2];
    }

    @Override
    public int compareTo(Record o) {
        return Integer.parseInt(o.index) - Integer.parseInt(index);
    }
}