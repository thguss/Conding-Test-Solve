

class Solution {
    public Boolean checking(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return true;
        }
        return false;
    }
    
    public int lotto(int num) {
        if (num == 6) return 1;
        else if (num == 5) return 2;
        else if (num == 4) return 3;
        else if (num == 3) return 4;
        else if (num == 2) return 5;
        else return 6;
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int score = 0;
        
        for (int n: win_nums) {
            if (checking(n, lottos)) score++;
        }
        
        int zero = 0;
        
        for (int n: lottos) {
            if (n == 0) zero++;
        }
        
        System.out.println(score);
        
        int iMax = zero + score; int iMin = score;
        
        int[] answer = new int[2];
        answer[0] = lotto(iMax); answer[1] = lotto(iMin);
        
        return answer;
    }
}