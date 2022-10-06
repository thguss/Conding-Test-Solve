import java.util.*;

class Solution5 {
    public long solution(long n) {
        
        String str = String.valueOf(Math.sqrt(n));
        StringTokenizer st = new StringTokenizer(str, ".");
        
        int x = Integer.parseInt(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        if (y!=0) return -1;
        
        return (long)Math.pow(x+1, 2);
    }
}