import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i=0; i<N; i++) numList.add(sc.nextInt());
        Collections.sort(numList);
        for(int num:numList) sb.append(num+"\n");
        System.out.println(sb);
    }
}