import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numList = new int[1000001];
        for(int i=0; i<N; i++) numList[i] = sc.nextInt();
        for(int i=0; i<N; i++) {
            int tmp = numList[i];
            int minIdx = minIdx(numList, i, N-1);
            numList[i] = numList[minIdx];
            numList[minIdx] = tmp;
            System.out.println(numList[i]);
        }
    }
    public static int minIdx(int[] numList, int begin, int end){
        int minIdx = 0;
        int i;
        for(i=begin; i<end; i++)
            minIdx = numList[i] < numList[minIdx] ? i : minIdx;
        return minIdx;
    }
}
