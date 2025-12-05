package boj.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ2563_1 {
    static class Rect {
        int x1, y1, x2, y2;
        Rect(int x, int y) {
            this.x1 = x;
            this.y1 = y;
            this.x2 = x + 10;
            this.y2 = y + 10;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Rect> papers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            papers.add(new Rect(x, y));
        }

        int area = 0;

        // y = 0 ~ 99를 한 줄씩 스캔
        for (int y = 0; y < 100; y++) {
            List<int[]> segments = new ArrayList<>();

            // 현재 y 줄과 겹치는 색종이들의 x 구간 수집
            for (Rect r : papers) {
                if (r.y1 <= y && y < r.y2) {
                    segments.add(new int[]{r.x1, r.x2});
                }
            }

            if (segments.isEmpty()) continue;

            // x 구간 정렬 (왼쪽 기준)
            Collections.sort(segments, (a, b) -> Integer.compare(a[0], b[0]));

            // 구간 병합
            int start = segments.get(0)[0];
            int end = segments.get(0)[1];

            for (int i = 1; i < segments.size(); i++) {
                int s = segments.get(i)[0];
                int e = segments.get(i)[1];

                if (s <= end) {
                    // 겹치면 병합
                    end = Math.max(end, e);
                } else {
                    // 끊기면 지금까지 길이 누적
                    area += end - start;
                    start = s;
                    end = e;
                }
            }

            area += end - start;
        }

        System.out.println(area);
        br.close();

    }
}
