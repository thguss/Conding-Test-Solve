

class Solution {
    public int solution(int[] numbers) {
        int res = 0;
        for (int i = 0; i < 10; i++) res += i;
        
        for (int i = 0; i < numbers.length; i++) {
            res -= numbers[i];
        }
        
        return res;
    }
}