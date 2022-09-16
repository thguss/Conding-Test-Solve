import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> al = new ArrayList<String>();
        
        for (int i = 0; i < strings.length; i++) {
            al.add(strings[i].charAt(n) + " " + strings[i]);
        }
        
        Collections.sort(al);

        String[] answer = new String[al.size()];
        
        for (int i = 0; i < al.size(); i++) {
          String[] target = al.get(i).split(" ");
          answer[i] = target[1];
        }
        
        return answer;
    }
}