import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		final int[] CHESS = {1, 1, 2, 2, 2, 8};
		int[] diff = new int[6];
		
		for(int i = 0; i < 6; i++) {
			diff[i] = CHESS[i] - Integer.parseInt(st.nextToken());
		}
		
		String result = "";
		for(int i = 0; i < diff.length; i++) {
			result += diff[i] + " ";
		}
		
		System.out.println(result.trim());
		br.close();
		
	}
}