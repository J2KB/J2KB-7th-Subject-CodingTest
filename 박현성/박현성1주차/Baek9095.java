package 박현성1주차;
	
import java.util.*;
public class Baek9095 {
	//0 = 0, 1 = 1, 2= 2, 3= 4, 4= 7, 5= 13
	// 4는 1 + 3 이다. 3을 1, 2, 3 더하기로 하였을 때의 경우의 수는 4가지이다.
	// 4는 2 + 2이다. 2를 1, 2, 3 더하기로 하였을 때의 경우의 수는 2가지이다.
	// 4는 3 + 1이다. 1을 1, 2, 3 더하기로 하였을 때의 경우의 수는 1가지이다.
	// 5는 1 + 4이다. 4를 1, 2, 3 더하기로 하였을 때의 경우의 수는 7가지이다.
	// 5는 2 + 3이다. 3를 1, 2, 3 더하기로 하였을 때의 경우의 수는 4가지이다.
	// 5는 3 + 2이다. 2을 1, 2, 3 더하기로 하였을 때의 경우의 수는 2가지이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[11];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int i = 0; i < n; i++) {
			int exam = sc.nextInt();
			for(int j = 4; j <= exam; j++) {
				arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
			}
			System.out.println(arr[exam]);
		}
	}
}
