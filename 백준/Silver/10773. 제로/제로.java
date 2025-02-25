import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}

		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
			
		System.out.println(sum);
		br.close();
	}
}
