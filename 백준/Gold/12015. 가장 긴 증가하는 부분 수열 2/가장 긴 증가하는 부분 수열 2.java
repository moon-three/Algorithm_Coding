import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(getLength(N, arr));
		
		br.close();
	}

	public static int getLength(int N, int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			int idx = Collections.binarySearch(list, i);
			if(idx < 0) idx = -(idx + 1);
			if(idx == list.size()) list.add(i);
			else list.set(idx, i);
		}
		return list.size();
	}
}