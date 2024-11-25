import java.util.Scanner;

public class B2042 {

    static long[] nums;       // 원본 배열
    static long[] segTree;    // 세그먼트 트리 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: n = 수의 개수, m = 변경 횟수, k = 구간 합 쿼리 횟수
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        nums = new long[n];
        segTree = new long[4 * n]; // 세그먼트 트리 크기: 배열 크기의 4배

        // 배열 입력
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }

        // 세그먼트 트리 초기화
        init(0, n - 1, 1);

        // 쿼리 처리
        StringBuilder result = new StringBuilder();
        int totalQueries = m + k;

        for (int i = 0; i < totalQueries; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextLong();

            if (a == 1) {
                // b번째 수를 c로 변경
                update(0, n - 1, 1, b - 1, c);
            } else if (a == 2) {
                // b~c의 합을 구함
                long sumResult = query(0, n - 1, 1, b - 1, (int) c - 1);
                result.append(sumResult).append("\n");
            }
        }

        // 결과 출력
        System.out.print(result);
    }

    // 세그먼트 트리 초기화
    static long init(int start, int end, int node) {
        if (start == end) {
            return segTree[node] = nums[start];
        }
        int mid = (start + end) / 2;
        return segTree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1);
    }

    // 구간 합 쿼리
    static long query(int start, int end, int node, int left, int right) {
        if (left > end || right < start) { // 범위 밖
            return 0;
        }
        if (left <= start && end <= right) { // 범위 안
            return segTree[node];
        }
        int mid = (start + end) / 2;
        return query(start, mid, node * 2, left, right) +
               query(mid + 1, end, node * 2 + 1, left, right);
    }

    // 값 변경
    static long update(int start, int end, int node, int index, long newValue) {
        if (index < start || index > end) { // 범위 밖
            return segTree[node];
        }
        if (start == end) { // 리프 노드
            return segTree[node] = newValue;
        }
        int mid = (start + end) / 2;
        return segTree[node] = update(start, mid, node * 2, index, newValue) +
                               update(mid + 1, end, node * 2 + 1, index, newValue);
    }
}
