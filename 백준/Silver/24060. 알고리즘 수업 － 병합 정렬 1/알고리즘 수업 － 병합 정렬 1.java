import java.util.Scanner;

public class Main {
    static int count = 0; // K번째 저장 위치를 추적하기 위한 전역 변수
    static int result = -1; // K번째 저장된 값을 저장할 변수

    public static void mergeSort(int[] A, int p, int r, int num) {
        if (p < r) {
            int q = (p + r) / 2; // 중간 지점 계산
            mergeSort(A, p, q, num); // 전반부 정렬
            mergeSort(A, q + 1, r, num); // 후반부 정렬
            merge(A, p, q, r, num); // 병합
        }
    }

    public static void merge(int[] A, int p, int q, int r, int num) {
        int[] tmp = new int[r - p + 1]; // 임시 배열
        int i = p, j = q + 1, t = 0;

        // 두 부분 배열을 비교하면서 병합
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
            count++;
            if (count == num) {
                result = tmp[t - 1];
                return; // K번째 값을 찾았으므로 즉시 리턴
            }
        }

        // 왼쪽 배열에 남은 요소를 tmp에 복사
        while (i <= q) {
            tmp[t++] = A[i++];
            count++;
            if (count == num) {
                result = tmp[t - 1];
                return;
            }
        }

        // 오른쪽 배열에 남은 요소를 tmp에 복사
        while (j <= r) {
            tmp[t++] = A[j++];
            count++;
            if (count == num) {
                result = tmp[t - 1];
                return;
            }
        }

        // tmp 배열의 내용을 A[p..r]에 복사하여 정렬된 상태로 저장
        t = 0;
        for (i = p; i <= r; i++) {
            A[i] = tmp[t++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int num = scanner.nextInt();
        int[] A = new int[max];

        for (int i = 0; i < max; i++) {
            A[i] = scanner.nextInt();
        }

        mergeSort(A, 0, A.length - 1, num);

        // 결과 출력: num 번째 저장된 값이 존재하는 경우에만 출력
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println(-1); // K번째 저장된 값이 없을 경우 -1 출력
        }
    }
}
