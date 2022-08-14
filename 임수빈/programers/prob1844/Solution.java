package 임수빈.programers.prob1844;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    boolean[][] visit;
    int[][] maps;
    int min;
    int count = 0;

    public int solution(int[][] maps) {
        visit = new boolean[maps.length][maps[0].length];
        this.maps = maps;
//        min = Integer.MAX_VALUE;
//        dfs(new Node(0,0),1);
//        if(count==0)return -1;
//        return min;
        return bfs();
    }

    public int bfs() {
        Queue<Node> queue = new LinkedList<>();
        Map<Node, Integer> dist = new HashMap<>();
        int depth = 1;
        visit[0][0] = true;
        queue.add(new Node(0, 0));
        dist.put(queue.peek(), 1);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;
            Node[] nodes = {new Node(x + 1, y), new Node(x, y + 1), new Node(x - 1, y), new Node(x, y - 1)};
            for (Node n : nodes) {
                x = n.x;
                y = n.y;
                if (x == maps.length - 1 && y == maps[0].length - 1) {
                    return dist.get(node) + 1;
                }
                if (x >= 0 && x < maps.length && y >= 0 && y < maps[0].length) {
                    if (maps[x][y] == 1) {
                        if (!visit[x][y]) {
                            visit[x][y] = true;
                            dist.put(n, dist.get(node) + 1);
                            queue.add(n);
                        }
                    }
                }
            }
        }
        return -1;
    }

    public void dfs(Node node, int depth) {
        int x = node.x;
        int y = node.y;
        if (x == maps.length - 1 && y == maps[0].length - 1) {
            count++;
            if (min > depth) min = depth;
        } else {
            Node[] nodes = {new Node(x - 1, y), new Node(x + 1, y), new Node(x, y - 1), new Node(x, y + 1)};
            visit[x][y] = true;
            for (Node n : nodes) {
                if (n.x >= 0 && n.x < maps.length && n.y >= 0 && n.y < maps[0].length) {
                    if (maps[n.x][n.y] == 1) {
                        if (!visit[n.x][n.y]) {
                            dfs(n, depth + 1);
                            visit[x][y] = false;
                        }
                    }
                }
            }
        }
    }

    class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}