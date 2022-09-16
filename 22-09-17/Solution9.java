import java.util.*;

public class Solution9 {
    public int[] solution(int []arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        al.add(arr[0]);
        
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            if (arr[i] != arr[i-1]) al.add(arr[i]);
        }
        
        int[] answer = new int[al.size()];
        
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }

        return answer;
    }
}