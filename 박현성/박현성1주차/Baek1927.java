package 박현성1주차;
import java.util.*;
public class Baek1927 {
	// 최소 힙 구하는 문제이다. PriorityQueue를 이용해서 풀었다. 
	public static void main(String[] args) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int arr = sc.nextInt();
			if(arr == 0) {
				if(heap.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(heap.poll());
				}
			}
			else {
				heap.add(arr);
			}
		}
	}
}
