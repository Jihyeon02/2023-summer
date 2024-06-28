import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String [] inPut = buffer.readLine().split(" ");

        long num1 = Long.parseLong(inPut[0]);
        long num2 = Long.parseLong(inPut[1]);
        long num3 = Long.parseLong(inPut[2]);

        long result1 = num1 + num2 + num3;


        System.out.println(result1);


    }
}