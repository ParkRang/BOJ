package boj;

import java.io.*;
import java.util.*;

public class boj14427 {
    static Pair[] tree;
    static int[] arr;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        tree = new Pair[4*N]; // 넉넉하게 4*N 크기

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        build(1, 1, N); // 초기 트리 구성

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            if (A == 2) {
                sb.append(tree[1].index).append("\n"); // 루트 출력
            } else {
                int idx = Integer.parseInt(st.nextToken());
                int val = Integer.parseInt(st.nextToken());
                update(1, 1, N, idx, val); // 값 갱신
            }
        }
        System.out.print(sb);
    }

    // Build 함수 (재귀)
    static void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = new Pair(arr[start], start);
            return;
        }
        int mid = (start + end) / 2;
        build(node*2, start, mid);
        build(node*2+1, mid+1, end);
        tree[node] = minPair(tree[node*2], tree[node*2+1]);
    }

    // Update 함수 (재귀)
    static void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = new Pair(val, idx);
            return;
        }
        int mid = (start + end) / 2;
        if (idx <= mid) update(node*2, start, mid, idx, val);
        else update(node*2+1, mid+1, end, idx, val);
        tree[node] = minPair(tree[node*2], tree[node*2+1]);
    }

    // 두 Pair 중 더 작은 값 선택 (값 같으면 인덱스 작은 쪽)
    static Pair minPair(Pair a, Pair b) {
        if (a.number < b.number) return a;
        else if (a.number > b.number) return b;
        else return (a.index < b.index ? a : b);
    }

    static class Pair {
        int number, index;
        Pair(int number, int index) {
            this.number = number;
            this.index = index;
        }
    }
}