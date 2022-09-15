

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1];
        answer[0] = -1;
        if (arr.length == 1) return answer;
        
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < temp) temp = arr[i];
        }
        
        int[] result = new int[arr.length-1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
                result[idx] = arr[i]; 
                idx++;
            }
        }
        
        return result;
    }
}