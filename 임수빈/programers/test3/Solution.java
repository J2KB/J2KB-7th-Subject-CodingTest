package 임수빈.programers.test3;

import java.util.*;

class Solution {
    public int solution(int[] order) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <=order.length; i++) {
            queue.add(i);
        }
        Stack<Integer> stack = new Stack<>();
        List<Integer> truck = new LinkedList<>();
        for (int need : order) {
            if(queue.contains(need)){
                while(queue.peek()!=need){
                    stack.push(queue.poll());
                }
                truck.add(queue.poll());
            }else if(stack.peek()==need){
                truck.add(stack.pop());
            }else{
                break;
            }
        }
        return truck.size();
    }
}

//import java.util.*;
//
//class Solution {
//    public int solution(int[] order) {
//        Queue<Integer> queue = new PriorityQueue<>();
//        for (int i = 1; i <=order.length; i++) {
//            queue.add(i);
//        }
//        Stack<Integer> stack = new Stack<>();
//        List<Integer> truck = new LinkedList<>();
//        for (int need : order) {
//            if(!queue.isEmpty()&&queue.peek()<=need){
//                while(queue.peek()!=need){
//                    stack.push(queue.poll());
//                }
//                truck.add(queue.poll());
//            }else if(stack.peek()==need){
//                truck.add(stack.pop());
//            }else{
//                break;
//            }
//        }
//        return truck.size();
//    }
//}