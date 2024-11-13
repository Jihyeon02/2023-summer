

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static int count;

    static class Graph {
        public int vertices;
        public LinkedList<Integer> adjList[];

        // 그래프 생성자
        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        // 간선 추가
        void addEdge(int v, int w) {
            adjList[v].add(w);
            adjList[w].add(v); // 양방향 간선 추가 (무방향 그래프)
        }

        // DFS 구현 (감염된 컴퓨터 수 세기)
        void DFS(int startVertex) {
            boolean visited[] = new boolean[vertices];
            count = 0; // 탐색 시작 전에 count 초기화
            DFSUtil(startVertex, visited);
        }

        // DFS 도우미 함수 (재귀적 호출)
        void DFSUtil(int vertex, boolean visited[]) {
            visited[vertex] = true;
            count++;

            Iterator<Integer> i = adjList[vertex].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정점의 수 입력받기
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        // 간선 수 입력받기
        int edges = scanner.nextInt();
        // 연결할 정점 입력받기
        for (int i = 0; i < edges; i++) {
            int v = scanner.nextInt() - 1; // 입력이 1부터 시작하는 경우 인덱스를 0부터 시작하도록 조정
            int w = scanner.nextInt() - 1;
            graph.addEdge(v, w);
        }

        // DFS 탐색 시작 (1번 컴퓨터를 0번째 인덱스로 가정)
        graph.DFS(0);
        System.out.println(count - 1); // 시작 컴퓨터를 제외한 감염된 컴퓨터 수 출력

        scanner.close();
    }
}
