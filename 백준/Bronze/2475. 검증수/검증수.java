import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 5; i++) {
			int data = Integer.parseInt(st.nextToken()); 
			sum += data * data;
		}
		
		System.out.println(sum % 10);
		br.close();
	}
}