import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];

        int word = System.in.read(); // 첫 문자 받기
        while (word > 64) {
            if(word < 91){ // 대문자
                arr[word - 65]++;
            } else { // 소문자
                arr[word - 97]++;
            }
            word = System.in.read(); // 다음문자 받기
        }

        int max = -1;
        int index = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) { // max보다 값이 클 경우
                max = arr[i];
                index = i;
            } else if (arr[i] == max) { // max와 같을 경우
                index = -2; // '?' = 63 이다.
            }
        }
        System.out.println((char) (index + 65));
    }
}