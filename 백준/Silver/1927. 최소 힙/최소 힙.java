import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; i<N; i++) {
			int data = Integer.parseInt(br.readLine());
			if(data == 0) {
				if(pq.isEmpty()) {
					pq.add(0);
				}
				sb.append(pq.poll()).append("\n");
				continue;
			}
			pq.add(data);
		}
		
		System.out.println(sb);
		br.close();
		
	}
}