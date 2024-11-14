import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 수의 개수
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        Arrays.toString(array);

        for (int i = 0; i < n; i++) {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}