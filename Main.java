import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] numList = new int[N][2];
        for(int i=0; i<N; i++){
            numList[i][0] = sc.nextInt();
            numList[i][1] = sc.nextInt();
        }
        Arrays.sort(numList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });
        for(int[] num:numList)
            System.out.println(num[0] + " " + num[1]);
    }
}