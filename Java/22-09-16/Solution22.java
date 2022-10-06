import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int res = 0;
        
        for (int i = 0; i < commands.length; ++i) {
            int[] answer = new int[commands[i][1]-commands[i][0]+1];
            int size = 0;
            for (int j = commands[i][0]-1; j < commands[i][1]; ++j) {
                answer[size++] = array[j];
            }
            Arrays.sort(answer);
            result[res++] = answer[commands[i][2]-1];
        }
        
        return result;
    }
}