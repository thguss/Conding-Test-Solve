class Solution {
  public long solution(long price, long money, long count) {
      long total = 0;
      
      for (int i = 1; i <= count; i++) {
          total += price * i;
      }
      
      if (money >= total) return 0;

      return total - money;
  }
}