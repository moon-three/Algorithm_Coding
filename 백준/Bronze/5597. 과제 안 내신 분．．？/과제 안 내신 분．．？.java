import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[31];
		
		for(int i = 1; i < 29; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num] = num;
		}
		
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == 0) System.out.println(i);
		}
		
		br.close();		
	}
}
