import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String [] input = buffer.readLine().split(" ");

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);


        int result = num1 - num2;
        System.out.println(result);

    }
}