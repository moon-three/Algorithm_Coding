import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		for(int i = 1; i <= value; i++) {
			for(int j = value; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 2 * i - 1; j++) {		
				System.out.print("*");
			}
			System.out.println();	
		}
	}	
}