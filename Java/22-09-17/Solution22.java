import java.util.*;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] board = new int[rows][columns];
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = num++;
            }
        }
        
        int[] answer = new int[queries.length];
        int res = 0;
        
        for (int i = 0; i < queries.length; i++) {
            int sc = queries[i][0] - 1; int sr = queries[i][1] - 1;
            int ec = queries[i][2] - 1; int er = queries[i][3] - 1;
            
            int[] arr = new int[2 * (ec - sc) + 2 * (er - sr)];
            int size = 0;
            
            int[] dx = {0, 1, 0, -1}; int[] dy = {1, 0, -1, 0};
            int x = sc; int y = sr; int w = 0; int temp = board[x][y];
            while (x != sc+1 || y != sr) {
                arr[size++] = temp;
                    
                x += dx[w]; y += dy[w];
                
                int origin = board[x][y]; board[x][y] = temp; temp = origin;
                
                if ((x==sc && y==er)||(x==ec && y==er) || (x==ec && y==sr)) w += 1;
            }
            
            x += dx[w]; y += dy[w];
            board[x][y] = temp;
            arr[size++] = temp;
            
            Arrays.sort(arr);

            answer[res++] = arr[0];
                
        }
        
        return answer;
    }
}