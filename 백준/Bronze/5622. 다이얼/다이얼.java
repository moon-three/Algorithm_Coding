import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		int[] arr = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
		int result = 0;
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			result += arr[ch - 'A'];
		}
		result += S.length();
		
		System.out.println(result);
		sc.close();
	}
}
