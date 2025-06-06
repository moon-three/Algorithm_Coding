import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static int[] answer;
	static int order = 1;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		answer = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			A[n1].add(n2);
			A[n2].add(n1);
		}
		
		for(int i = 1; i <= N; i++) {
			Collections.sort(A[i], Collections.reverseOrder());
		}
		
		BFS(R);
		
		for(int i = 1; i <= N; i++) {
			System.out.println(answer[i]);
		}
		br.close();
	}
	
	public static void BFS(int i) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		visited[i] = true;
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			answer[cur] = order++;
			for(int j : A[cur]) {
				if(!visited[j]) {
					queue.add(j);
					visited[j] = true;
				}
			}
		}
	}
}