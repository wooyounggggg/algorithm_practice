import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        String[] subStrs = new String[length];
        for(int i=0; i<length; i++) subStrs[i] = str.substring(i);
        Arrays.sort(subStrs);
        for(int i=0; i<length; i++)
            System.out.println(subStrs[i]);
    }
}
