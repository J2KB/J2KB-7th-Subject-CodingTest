package 임수빈.programers.prob86971;

import java.util.*;

public class Solution {
    public int solution(int n, int[][] wires) {
        int count = 0;
        Map<Integer,List<Integer>> map = new HashMap();
        for (int i = 0; i < n; i++) {
            map.put(i,new ArrayList<>());
        }
        int answer = n;
        for (int i = 0; i < wires.length; i++) {
            for (int j = 0; j < wires.length; j++) {
                if(j==i)continue;
                map.get(wires[j][1]-1).add(wires[j][0]-1);
                map.get(wires[j][0]-1).add(wires[j][1]-1);
            }
            answer = Math.min(answer, bfs(map));
            for (int j = 0; j < n; j++) {
                map.put(j,new ArrayList<>());
            }
        }
        return answer;
    }
    private int bfs(Map<Integer,List<Integer>> map){
        boolean[] visited = new boolean[map.keySet().size()];
        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true;
        queue.add(0);
        while (!queue.isEmpty()){
            int node = queue.poll();
            visited[node]=true;
            List<Integer> adj = map.get(node);
            for (int n : adj) {
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        int visitCount =0;
        int noVisitCount =0;
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]){
                visitCount++;
            }else {
                noVisitCount++;
            }
        }
        return Math.abs(visitCount-noVisitCount);
    }
}