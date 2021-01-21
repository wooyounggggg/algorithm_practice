import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] nameList = new String[N][4]; /* 이름 국어 영어 수학 */
        for(int i=0; i<N; i++)
            for(int j=0; j<4; j++)
                nameList[i][j] = sc.next();
        Arrays.sort(nameList, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.valueOf(o1[1]) == Integer.valueOf(o2[1])){
                    if(Integer.valueOf(o1[2]) == Integer.valueOf(o2[2])) {
                        if (Integer.valueOf(o1[3]) == Integer.valueOf(o2[3]))
                            return o1[0].compareTo(o2[0]);
                        return Integer.valueOf(o2[3]) - Integer.valueOf(o1[3]);
                    }
                    return Integer.valueOf(o1[2]) - Integer.valueOf(o2[2]);
                }
                return Integer.valueOf(o2[1]) - Integer.valueOf(o1[1]);
            }
        });
        for(String[] name:nameList) System.out.println(name[0]);
    }
}
