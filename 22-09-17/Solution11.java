import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        while(n > 0) {
            al.add(n%3);
            n /= 3;
        }
        
        System.out.println(al);
        
        int answer = 0;
        
        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.println(Math.pow(3, al.size() - 1 - i));
            answer += al.get(i) * Math.pow(3, al.size() - 1 - i);
        }
        
        
        return answer;
    }
}