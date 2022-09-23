package 박현성.박현성6주차;

public class JadenCase {

	public static void main(String[] args) {
		String s = "for the last week ";
		String answer = "";
		
		// 모든 문자열 소문자로 변경
        String[] srr = s.toLowerCase().split("");
        
        boolean isFirst = true; // 첫번째 글자인지 판단 
        
        for(int i = 0; i < srr.length; i++) {
            // 첫 글자일 경우 대문자로 변경
        	if(isFirst) {
        		answer += srr[i].toUpperCase(); 
        	}
        	else {
        		answer += srr[i];
        	}
            // 공백이 나오면 첫 글자 플그래 true로 변경
        	if(srr[i].equals(" ")) {
        		isFirst = true;
        	}
        	else {
        		isFirst = false;
        	} 
        }
        System.out.println(answer);
	}
}
