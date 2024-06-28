import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String [] inPut = buffer.readLine().split(" ");

        int num1 = Integer.parseInt(inPut[0]);
        int num2 = Integer.parseInt(inPut[1]);
        int num3 = Integer.parseInt(inPut[2]);
        //(A+B)%C
        int result1 = (num1+num2) % num3;
        //((A%C) + (B%C))%C
        int result2 = ((num1%num3) + (num2%num3)) % num3;
        //(A×B)%C
        int result3 = (num1 * num2) % num3;
        // ((A%C) × (B%C))%C
        int result4 = ((num1%num3) * (num2%num3)) % num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}