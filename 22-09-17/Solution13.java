

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int asci = c - '0';

            if (49 <= asci && asci < 75) {
                if (asci + n >= 75) asci += n - 26;
                else asci += n;
            } else if (17 <= asci && asci < 43) {
                if (asci + n >= 43) asci += n -26;
                else asci += n;
            }

            answer += c == ' ' ? c : (char)(asci + '0');
        }
        return answer;
    }
}

