
class Solution {
  public String solution(String phone_number) {
      String answer = "";
      
      for(int i = 0; i < phone_number.length()-4; i++) {
          answer += "*";
      }
      for (int i = phone_number.length()-4; i < phone_number.length(); i++) {
          answer += phone_number.charAt(i);
      }
      
      return answer;
  }
}


/*
 * 참고하고 싶은 풀이

class Solution {
  public String solution(String phone_number) {
      char[] ch = phone_number.toCharArray();
      
      for(int i = 0; i < phone_number.length()-4; i++) {
          ch[i] = '*';
      }
      
      return String.valueOf(ch);
  }
}
*/