package 박현성.박현성6주차;

import java.util.Arrays;
import java.util.Collections;

public class CreateMin {
	public static void main(String[] args) {
		int []a = {1, 4, 2};
		int []b = {5, 4, 4};
		
		int answer = 0;
        
        Arrays.sort(a);  // 두 배열을 정렬 해준다. 
        Arrays.sort(b);  
        
        for(int i = 0; i < a.length; i++) {
        	answer = answer + (a[i] * b[a.length - 1 - i]);  // a는 오름차순으로 선택하고 b는 큰 수 부터 선택헤서 곱해준다.
        }
        System.out.println(answer);
	}
}
