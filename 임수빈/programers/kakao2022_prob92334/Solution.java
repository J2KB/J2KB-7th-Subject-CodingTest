package 임수빈.programers.kakao2022_prob92334;
// 푸는데 걸린 시간 : 26분
import java.util.*;

class Solution {
    public Integer[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        Map<String, Integer> reportCount = new HashMap<>(); // 유저 - 유저가 신고된 횟수
        for (String str :
                id_list) {
            reportCount.put(str, 0);
        }
        Map<String, Set<String>> reportMap = new HashMap<>(); // 유저 - 유저가 신고한 유저 목록
        for (String str : report) {
            String strs[] = str.split(" ");
            if(!reportMap.containsKey(strs[0])){
                Set<String> set = new HashSet<>();
                reportMap.put(strs[0],set);
            }
            Set<String> set = reportMap.get(strs[0]);
            if (!set.contains(strs[1])) {
                reportCount.put(strs[1], reportCount.get(strs[1]) + 1);
                set.add(strs[1]);
            }
        }
        List<Integer> result = new ArrayList<>(); // 결과
        for (String id : id_list) { // 유저 - 유저가 신고한 유저 목록 을 이용
            Set<String> reportSet = reportMap.get(id);
            int count = 0;
            if(reportSet != null) {
                for (String str : reportSet) {
                    if (reportCount.get(str) >= k) { // 유저가 신고한 다른 유저 목록에서 기준치를 초과해 신고된 유저를 고름
                        count++;
                    }
                }
                result.add(count);
            }else {
                result.add(0);
            }
        }

        return result.toArray(new Integer[id_list.length]);
    }
}