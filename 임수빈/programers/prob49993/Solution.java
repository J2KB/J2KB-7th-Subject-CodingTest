package 임수빈.programers.prob49993;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//36분
class Solution {
    public int solution(String skill, String[] skill_trees) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < skill.length(); i++) {
            stringBuffer.append(i);
        }
        int count =0;
        for (String s : skill_trees) {
            List<Integer> list = new ArrayList<>();
            for (char c :
                    s.toCharArray()) {
                if(skill.contains(c+"")){
                   list.add(skill.lastIndexOf(c));
                }
            }
            if(list.isEmpty()){
                count++;
                continue;
            }
            StringBuffer sb = new StringBuffer();
            for (int a :list) {
                sb.append(a);
            }
            if(stringBuffer.toString().contains(sb.toString()) && list.contains(0))count++;
        }
        return count;
    }
}
