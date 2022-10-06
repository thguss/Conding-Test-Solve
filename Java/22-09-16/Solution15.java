import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        String answer = "김서방은 " + String.valueOf(index) + "에 있다";
        return answer;
    }
}