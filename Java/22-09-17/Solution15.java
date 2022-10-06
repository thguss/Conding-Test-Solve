

class Solution {
    public int solution(int[][] sizes) {
        int clen = sizes.length;
        
        for (int i = 0; i < clen; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        int cMax = 0; int rMax = 0;
        for (int i = 0; i < clen; i++) {
            cMax = Math.max(cMax, sizes[i][0]);
            rMax = Math.max(rMax, sizes[i][1]);
        }
        
        return cMax * rMax;
    }
}