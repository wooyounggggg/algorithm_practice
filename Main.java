import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i=0; i<N; i++) numList.add(sc.nextInt());
        Collections.sort(numList);
        for(int num:numList) sb.append(num).append("\n");
        System.out.println(sb);
    }
}