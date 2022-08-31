package 임수빈.programers.test6;

import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for (int[] road :  roads) {
            if(graph.containsKey(road[0])){
                graph.get(road[0]).add(road[1]);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(road[1]);
                graph.put(road[0],list);
            }
            if(graph.containsKey(road[1])){
                graph.get(road[1]).add(road[0]);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(road[0]);
                graph.put(road[1],list);
            }
        }
//        int[] results = new int[sources.length];
//        for (int i = 0; i < sources.length; i++) {
//            results[i] = bfs(graph,sources[i],destination,n);
//        }
        return dijk(graph,destination,sources);
    }
    int[] dijk(Map<Integer,List<Integer>> graph,int start,int[] s){
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        map.put(start,0);
        visited.add(start);
        Queue<Integer> priorityQueue = new LinkedList<>();
        priorityQueue.add(start);
        while (!priorityQueue.isEmpty()){
            int node = priorityQueue.poll();
            try {
                for (int n : graph.get(node)) {
                    if (visited.contains(n)) {
                        continue;
                    }
                    if (map.containsKey(n)) {
                    } else {
                        map.put(n, map.get(node) + 1);
                        visited.add(n);
                        priorityQueue.add(n);
                    }
                }
            }catch (Exception e){
                continue;
            }
        }
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            try {
                result[i] = map.get(s[i]);
            }catch (Exception e){
                result[i]=-1;
            }
            if(!graph.containsKey(s[i])){
                result[i]=-1;
            }
        }
        return  result;
    }
    int bfs(Map<Integer,List<Integer>> graph,int start,int dest,int nodeCount){
        if(start == dest) return 0;
        boolean[] visited = new boolean[nodeCount+2];
        Queue<Integer> queue = new PriorityQueue<>();
        int[] lengthOfStartAndNode = new int[visited.length];
        visited[start] = true;
        queue.add(start);
        lengthOfStartAndNode[start]=0;
        while (!queue.isEmpty()){
            int node = queue.poll();
            visited[node] = true;
            try {
                for (int n : graph.get(node)) {
                    if(n==dest){
                        return lengthOfStartAndNode[node]+1;
                    }
                    visited[n]=true;
                    queue.add(n);
                    lengthOfStartAndNode[n] = lengthOfStartAndNode[node]+1;
                }
            }catch (NullPointerException ignored){
            }

        }
        return -1;
    }
}