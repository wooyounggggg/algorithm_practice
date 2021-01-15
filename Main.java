public class Main {
    private static int N;
    private static int K;
    private static long result;
    private static int[] numList;
    public static void main(String[] args){
        Main app = new Main(args);
        for(int i=0; i<N+1; i++) numList[i] = i;
        app.solution(N, K, numList, 0);
        System.out.println(result % 1000000000L);
    }
    public Main(String[] args){
        N = Integer.parseInt(args[0]);
        K = Integer.parseInt(args[1]);
        numList = new int[N+1];
        result = 0;
    }

    public void solution(int targetSum, int elementNum, int[] usedNums, int seq){
        if(targetSum < 0) return;
        if(elementNum > 1)
            for(int i:usedNums) solution(targetSum-i, elementNum - 1, usedNums, seq + 1);
        else if(elementNum == 1 && targetSum <= N && hasElement(targetSum, usedNums)) result++;
    }
    public boolean hasElement(int element, int[] elements){
        for(int i:elements) if(i==element) return true;
        return false;
    }
}
