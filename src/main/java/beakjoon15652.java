import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon15652 {

    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int[] result = new int[m];
        combination(arr, result, 0, m, 0);
    }

    static void combination(int[] arr, int[] result, int depth, int goal, int count) {
        if (count == goal) {
            print(result);
            return;
        }
        for (int i = depth; i < n; i++) {
            result[count] = arr[i];
            combination(arr, result, i, goal, count + 1);
        }
    }

    static void print(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int j : arr) {
            result.append(j).append(" ");
        }
        System.out.println(result);
    }
}
