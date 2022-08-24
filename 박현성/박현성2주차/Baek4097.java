package 박현성.박현성2주차;
import java.util.*;

public class Baek4097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int max = Integer.MIN_VALUE;   // max값을 0으로 선언하면 밑에 음수일 경우 0으로 답이 나와서 Integer.MIN_VALUE 써야함 
			int sum = 0;
			if(n == 0) {
				break;
			}
			else {
				for(int i = 0; i < n; i++) {
					int num = sc.nextInt();
					sum += num;                // -3, 1, 10, 8, 3, 11
					max = Math.max(max, sum);  // 0, 1, 10, 10, 10, 11
					if(sum < 0) {
						sum = 0;
					}
				}
				System.out.println(max);
			}
		}
	}
}
