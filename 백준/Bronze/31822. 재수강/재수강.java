import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String retry = br.readLine().substring(0, 5);
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 0; i < N; i++) {
            String subject = br.readLine().substring(0 ,5);
            if(retry.equals(subject)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        br.close();
    }
}