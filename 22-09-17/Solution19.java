class Solution {
  public String solution(int a, int b) {
      int day = 0;
      for (int i = 1; i < a; i++) {
          if (i == 2) day += 29;
          else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) day += 31;
          else day += 30;
      }
      
      day += b;
      
      String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
      
      System.out.println(day%7);

      return week[day%7];
  }
}