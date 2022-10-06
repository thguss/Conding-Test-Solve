import java.util.*;

class Solution {
    public String solution(String s) {
        int len = s.length();
        char[] arr = new char[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(i);
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        String answer = "";
        for (int i = arr.length-1; i >= 0; i--) {
            answer += arr[i];
        }
        
        return answer;
    }
}