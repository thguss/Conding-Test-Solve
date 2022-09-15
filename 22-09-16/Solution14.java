class Solution {
  public long solution(int a, int b) {
      int start = 0;
      int end = 0;
      
      if (a > b) {
          start = b;
          end = a;
      } else {
          start = a;
          end = b;
      }
      
      long answer = 0;
      
      for (int i = start; i < end+1; i++) {
          answer += i;
      }
      
      return answer;
  }
}