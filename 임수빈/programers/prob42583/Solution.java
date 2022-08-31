package 임수빈.programers.prob42583;

import java.util.LinkedList;
import java.util.Queue;
/*
* 이 문제에서 1초 지날대마다 다리위의 트럭들이 모두 1칸씩 이동한다는 것이 포인트다.
* 다리위의 트럭들을 큐로 표현하면, 각 트럭이 1칸 전진한다는 것은 큐의 크기가 1 늘어난다는 것이다.
* 다리에 트럭이 올라갈 수 있으면 트럭 큐에서 트럭을 빼 올리면 된다. 만약 다리에 트럭이 올라갈 수 없으면 무게가 0인 트럭을 올린다고 생각하고 큐에 0을 집어넣는다.
* 다리 맨 앞의 트럭이 다리를 빠져나가는 순간은 다리의 길이와 다리위의 트럭들을 표현한 큐의 길이가 같아질 때이다. */
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        for(int truck:truck_weights){
            queue.add(truck);
        }
        int time = bridge_length;
        int[] boardTime = new int[truck_weights.length];
        int nowWeight =0;
        Queue<Integer> bridge = new LinkedList<>();
        while(!queue.isEmpty()){
            time++;
            if(nowWeight+queue.peek()<=weight){ // 다리에 올라갈 수 있다.
                nowWeight += queue.peek();
                bridge.add(queue.poll());
            }else { // 다리에 올라갈 수 없다. 이때는 무게가 0인 트럭이 올라간다고 생각하면 자연스럽게 트럭이 전진함을 표현할 수 있다.
                bridge.add(0);
            }
            if(bridge.size()==bridge_length){
                nowWeight -= bridge.poll();
            }
        }
        return time;
    }
}