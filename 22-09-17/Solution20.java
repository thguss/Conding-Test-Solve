import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int iMax = nums[nums.length - 1];
        
        int[] pocketmon = new int[iMax + 1];
        
        for (int i = 0; i < nums.length; i++) {
            pocketmon[nums[i]] += 1;
        }
        
        int answer = 0;
        
        for (int i = 0; i < pocketmon.length; i++) {
            if (answer >= nums.length/2) return (int)nums.length/2;
            
            if (pocketmon[i] > 0) answer += 1;
        }
        
        return answer;
    }
}