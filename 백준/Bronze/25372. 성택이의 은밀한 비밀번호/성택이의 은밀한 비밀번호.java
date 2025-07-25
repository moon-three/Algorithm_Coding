import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            int length = input.length();
            if(length >= 6 && length <= 9) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}