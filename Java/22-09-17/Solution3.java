class Solution {
  public boolean solution(String s) {
      int len = s.length();
      
      if (len != 4 && len != 6) return false;
      
      for (int i = 0; i < len; i++) {
          int ASCI = s.charAt(i) - '0';
          if (ASCI < 0 || ASCI > 9) return false;
      }

      return true;
  }
}