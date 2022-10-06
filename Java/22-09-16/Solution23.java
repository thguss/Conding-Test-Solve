import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            int a = answers[i];
            if (first[i%first.length] == a) res1 += 1;
            if (second[i%second.length] == a) res2 += 1;
            if (third[i%third.length] == a) res3 += 1;
        }
        
        int [] result = {res1, res2, res3};
        int iMax = 0;
        for (int num: result) iMax = Math.max(num, iMax);
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if (res1 == iMax) answer.add(1);
        if (res2 == iMax) answer.add(2);
        if (res3 == iMax) answer.add(3);
        
        int[] res = new int[answer.size()];
        int size = 0;
        for (int m: answer) res[size++] = m; 
        
        return res;
    }
}