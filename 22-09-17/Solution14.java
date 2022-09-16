import java.util.*;

class Solution {
    public String toBinary(int num, int s) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        while (num > 0) {
            al.add(num%2);
            num /= 2;
        }
        
        while (al.size() < s) {
            al.add(0);
        }
        
        String result = "";
        for(int i = s-1; i >= 0; i--) {
            result += al.get(i) == 1 ? "#" : " ";
        }
        
        return result;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String map1 = toBinary(arr1[i], n);
            String map2 = toBinary(arr2[i], n);
            
            String line = "";
            
            for (int j = 0; j < n; j++) {
                char c1 = map1.charAt(j); char c2 = map2.charAt(j);
                line += c1 == ' ' && c2 == ' ' ? ' ' : '#';
            }
            
            answer[i] = line;

        }
        
        return answer;
    }
}