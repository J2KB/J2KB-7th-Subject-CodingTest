package 임수빈.programers.prob42608;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {
        DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();
        for(String op : operations){
            String[] ops = op.split(" ");
            switch (ops[0]){
                case "I":
                    doublePriorityQueue.add(Integer.parseInt(ops[1]));
                    break;
                case "D":
                    if(ops[1].contentEquals("1")){
                        doublePriorityQueue.deleteMax();
                    }else{
                        doublePriorityQueue.deleteMin();
                    }
                    break;
            }
        }
        return doublePriorityQueue.getMinAndMax();
    }
    class DoublePriorityQueue{
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());

        void add(int a){
            minQ.add(a);
            maxQ.add(a);
        }

        void deleteMax(){
            maxQ.poll();
            minQ.clear();
            minQ.addAll(maxQ);
        }

        void deleteMin(){
            minQ.poll();
            maxQ.clear();
            maxQ.addAll(minQ);
        }

        int[] getMinAndMax(){
            if(minQ.isEmpty() || maxQ.isEmpty()){
                return new int[]{0,0};
            }else{
                return new int[]{maxQ.poll(),minQ.poll()};
            }
        }
    }
}