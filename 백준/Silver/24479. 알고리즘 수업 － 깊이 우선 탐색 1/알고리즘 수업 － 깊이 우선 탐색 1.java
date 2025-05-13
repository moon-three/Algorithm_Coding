import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	static int[] answer;
	static int order = 1;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] nodes = new ArrayList[N + 1];
		boolean[] visited = new boolean[N + 1];
		answer = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			nodes[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			nodes[a].add(b);
			nodes[b].add(a);
		}
		// 오름차순 접근을 위한 리스트 정렬 ..
		for(int i = 1; i <= N; i++) {
			Collections.sort(nodes[i]);
		}
		
		DFS(nodes, visited, R);
		
		for(int i = 1; i <= N; i++) {
			System.out.println(answer[i]);
		}
		
		br.close();
	}
	
	public static void DFS(ArrayList<Integer>[] nodes, boolean[] visited, int n) {
		answer[n] = order++;
		visited[n] = true;
		for(int i : nodes[n]) {
			if(!visited[i]) {
				DFS(nodes, visited, i);
			}
		}
	}
}