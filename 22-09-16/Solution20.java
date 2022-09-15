class Solution {
  public String solution(int n) {
      String answer = "";
      int watermelon = n/2;
      
      for (int i = 0; i < watermelon; i++) {
          answer += "수박";
      }
      
      if (n%2 == 1) answer += "수";
      
      return answer;
  }
}