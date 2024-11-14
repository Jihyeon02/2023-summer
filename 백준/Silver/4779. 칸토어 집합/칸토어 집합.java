import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static char array1[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int lineLength = (int) Math.pow(3, n);

            MakingLine(lineLength); // 라인을 초기화하여 생성
            CutLine(0, lineLength);  // 칸토어 집합 만들기

            System.out.println(array1); // 결과 출력
        }
        sc.close();
    }

     public static void MakingLine(double lineLength) {
        // 배열을 lineLength 크기로 초기화
        array1 = new char[(int)lineLength];

        // 배열을 '-' 문자로 채우기
        for (int i = 0; i < (int)lineLength; i++) {
            array1[i] = '-';
        }
     }

    public static void CutLine(int start, int length) {
        if (length < 3) {
            return; // 길이가 3 미만이면 더 이상 나눌 수 없으므로 종료
        }

        int third = length / 3;

        // 가운데 구간을 공백으로 채우기
        Arrays.fill(array1, start + third, start + 2 * third, ' ');

        // 좌측 및 우측 구간에 대해 재귀 호출
        CutLine(start, third);
        CutLine(start + 2 * third, third);
    }
}