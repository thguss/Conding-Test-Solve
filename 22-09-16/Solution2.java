
public class Solution2 {
    public int solution(int n) {
        String transfer = String.valueOf(n);
        int answer = 0;
        
        for (int i=0; i<transfer.length(); i++) {
            answer += transfer.charAt(i) - '0';
        }

        return answer;
    }
}