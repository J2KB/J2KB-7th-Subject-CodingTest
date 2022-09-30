package 박현성.박현성7주차;
import java.util.*;
public class ValidParentheses {

	public static void main(String[] args) {
		String s = "()[]{}";
		
		Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
		Stack<Character> stack = new Stack<>();
		
		for(Character chr : s.toCharArray()) {
			if(chr == '(' || chr == '{' || chr == '[') {
				stack.push(chr);
			}
			else if(stack.isEmpty() || stack.pop() != map.get(chr)) {
				System.out.println(false);
			}
		}
		System.out.println(stack.isEmpty());
	}
}
