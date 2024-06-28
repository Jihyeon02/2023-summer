import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String [] input = buffer.readLine().split(" ");

        double num1 = Double.parseDouble(input[0]);
        double num2 = Double.parseDouble(input[1]);


        Double result = num1 / num2;
        System.out.println(result);

    }
}