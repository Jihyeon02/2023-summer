
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = -1;
            for (int i = n / 5; i >= 0; i--) {
                int amount = n - (i * 5); // 5kg 봉지를 사용한 후 남은 무게
                if (amount % 3 == 0) {    // 남은 무게가 3으로 나누어 떨어지면
                    result = i + (amount / 3); // 5kg 봉지 개수 + 3kg 봉지 개수
                    break;
                }
            }System.out.println(result);

        }
    }

