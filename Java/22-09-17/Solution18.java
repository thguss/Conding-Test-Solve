import java.util.*;

class Solution {
    public Boolean checking(ArrayList<Integer> al, int num) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == num) return false;
        }
        return true;
    }
    
    public int[] solution(int[] numbers) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                if (checking(al, num)) {
                    al.add(num);
                }
            }
        }
        
        Collections.sort(al);

        int[] answer = new int[al.size()];
        
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}