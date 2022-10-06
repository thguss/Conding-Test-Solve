class Solution {
  public int[] solution(int n, int m) {
      int[] answer = new int[2];
      int iMin = 0; int iMax = 0;
      
      if (n > m) {
          iMin = m; iMax = n;
      } else {
          iMin = n; iMax = m;
      }
      
      for (int i = iMin; i > 0; i--) {
          if (n%i==0 && m%i==0) {
              answer[0] = i;
              break;
          }
      }
      
      while(true) {
          if (iMax%n==0 && iMax%m==0) {
              answer[1] = iMax;
              break;
          }
          
          iMax++;
      }
      
      return answer;
  }
}