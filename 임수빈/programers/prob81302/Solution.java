package 임수빈.programers.prob81302;

import java.util.*;

class Solution {
    public Integer[] solution(String[][] places) {
        List<Integer> result = new ArrayList<>();
        for (String[] room :places) {
            boolean[][] parti = new boolean[5][5];
            boolean[][] person = new boolean[5][5];
            List<Node> list = new ArrayList<>();
            for (int i = 0; i < room.length; i++) {
                char[] arr  = room[i].toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j]=='X'){
                        parti[j][i]=true;
                        person[j][i]=false;
                    }else if (arr[j]=='P'){
                        parti[j][i]=false;
                        person[j][i]=true;
                        list.add(new Node(j,i));
                    }
                }
            }
            boolean flag = true;
            loopA:for (int i = 0; i < list.size(); i++) {
                int x1 = list.get(i).x;
                int y1 = list.get(i).y;
                for (int j = 0; j < list.size(); j++) {
                    if(i==j)continue;
                    int x2 = list.get(j).x;
                    int y2 = list.get(j).y;
                    int dist = Math.abs(x1-x2)+Math.abs(y1-y2);
                    if(dist==1){
                        result.add(0);
                        flag = false;
                        break loopA;
                    } else if (dist==2) {
                        if(x1==x2){
                            if(!parti[x1][(y1+y2)/2]){
                                result.add(0);
                                flag = false;
                                break loopA;
                            }
                        }else if (y1==y2){
                            if(!parti[(x1+x2)/2][y1]){
                                result.add(0);
                                flag = false;
                                break loopA;
                            }
                        }else {
                            if(!parti[x1][y2] || !parti[x2][y1]){
                                result.add(0);
                                flag = false;
                                break loopA;
                            }
                        }
                    }
                }
            }
            if(flag)result.add(1);
        }
        return result.toArray(new Integer[0]);
    }
    class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}