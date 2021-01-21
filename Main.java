import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] numList = new int[N];
        for(int i=0; i<N; i++) numList[i] = sc.nextInt();
        Arrays.sort(numList);
        for(int num:numList) sb.append(num+"\n");
        System.out.println(sb);
    }
}