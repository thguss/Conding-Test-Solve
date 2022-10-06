import java.util.*;

class Solution8 {
    public long solution(long n) {
        String str = String.valueOf(n);
        int[] array = new int[str.length()];
        
        for (int i=0; i<str.length(); i++) {
            array[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(array);
        
        String answer = "";
        for(int i=array.length-1; i>=0; i--) {
            answer += array[i];
            
        }
        
        return Long.parseLong(answer);
    }
}