class Solution {
  boolean solution7(String s) {
      
      int p = 0;
      int y = 0;
      
      for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'P' || s.charAt(i) == 'p') p += 1;
          else if (s.charAt(i)=='Y' || s.charAt(i)=='y') y += 1;
      }
      
      if (p==y) return true;
      else return false;

  }
}