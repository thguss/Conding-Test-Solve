class Solution {
  public Boolean counting(int num) {
      int cnt = 0;
      
      for (int i = 1; i < num+1; i++) {
          if (num%i == 0) cnt++;
      }
      
      if (cnt%2 == 0) return true;
      else return false;
  }
  
  
  public int solution(int left, int right) {
      int answer = 0;
      
      for (int i = left; i <= right; i++) {
          if (counting(i)) answer += i;
          else answer -= i;
      }
      
      return answer;
  }
}