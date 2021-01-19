import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static int N;
    private static int[] P;
    private static int result;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Main app = new Main(sc);
        app.solution(N);
        System.out.println(result);
        /*
            dp[n] = dp[n-i] + dp[i]
        */
    }
    public Main(Scanner sc){
        N = sc.nextInt();
        P = new int[N+1];
        for(int i=1;i<=N;i++) P[i]=Integer.parseInt(sc.next());
    }

    public void solution(int N){
        for(int i=0; i<N; i++) {
            result += P[i];
            if(N>0) solution(N - i);
        }
    }
}
