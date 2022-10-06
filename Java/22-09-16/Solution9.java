class Solution9 {
  public boolean solution(int x) {
      int num = 0;
      String str = String.valueOf(x);
      
      for(int i=0; i<str.length(); i++) {
          num += str.charAt(i) - '0';
      }
      
      if (x%num==0) return true;
      else return false;

  }
}