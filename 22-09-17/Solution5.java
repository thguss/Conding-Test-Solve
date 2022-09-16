class Solution {
  public int[][] solution(int[][] arr1, int[][] arr2) {
      int clen = arr1.length;
      int rlen = arr1[0].length;
      int[][] answer = new int[clen][rlen];
      
      for (int i = 0; i < clen; i++) {
          for (int j = 0; j < rlen; j++) {
              answer[i][j] = arr1[i][j] + arr2[i][j];
          }
      }
      
      return answer;
  }
}