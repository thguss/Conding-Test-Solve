import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> al = new ArrayList<Integer> ();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor == 0) al.add(arr[i]);
        }
        
        if (al.size() == 0) al.add(-1);

        
        int[] array = new int[al.size()];
        int size = 0;
        for (int num: al) {
            array[size++] = num;
        }
        
        Arrays.sort(array);
        
        return array;
    }
}