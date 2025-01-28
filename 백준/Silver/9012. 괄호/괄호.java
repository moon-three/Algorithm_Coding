import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < T; i++) {
			String input = sc.nextLine();
			Stack<Character> stack = new Stack<>();
			
			boolean isValid = true;
			
			for(char ch : input.toCharArray()) {
				
				if(ch == '(') {
					stack.push(ch);
				} else if (ch == ')') {
					if (stack.isEmpty()) {
						isValid = false;
						break;
					} else {
						stack.pop();
					}
				}
				
			}
			
			if(stack.isEmpty() && isValid == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		sc.close();
	}
}