import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = new String[4];
        for(int i=0; i<2; i++){
            str[i*2] = input.split(" ")[i*2];
            str[i*2+1] = input.split(" ")[i*2+1];
        }
        long val1 = Long.parseLong(str[0]+str[1]);
        long val2 = Long.parseLong((str[2]+str[3]));
        System.out.println(val1+val2);
    }
}
