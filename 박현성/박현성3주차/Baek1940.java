package 박현성.박현성3주차;
import java.util.*;
import java.io.*;
public class Baek1940 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int i = 0;
		int j = n -1;
		while (i < j) {
			if(arr[i] + arr[j] == m) {
				i++;
				j--;
				cnt++;		
			} 
			else if(arr[i] + arr[j] < m) {
				i++;
			}
			else {
				j--;
			}
		}
		
		System.out.println(cnt);
	}

}
