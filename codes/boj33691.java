package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class boj33691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> lastUsed = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            lastUsed.put(s, i); 
        }

        int K = Integer.parseInt(br.readLine());
        HashSet<String> pinned = new HashSet<>();
        for (int i = 0; i < K; i++) {
            pinned.add(br.readLine());
        }

        List<Container> pinnedList = new ArrayList<>();
        List<Container> normalList = new ArrayList<>();

        for (Map.Entry<String, Integer> e : lastUsed.entrySet()) {
            if (pinned.contains(e.getKey())) {
                pinnedList.add(new Container(e.getKey(), e.getValue()));
            } else {
                normalList.add(new Container(e.getKey(), e.getValue()));
            }
        }

        pinnedList.sort((a, b) -> b.time - a.time);
        normalList.sort((a, b) -> b.time - a.time);

        StringBuilder sb = new StringBuilder();
        for (Container c : pinnedList) sb.append(c.name).append("\n");
        for (Container c : normalList) sb.append(c.name).append("\n");

        System.out.print(sb);
    }

    static class Container {
        String name;
        int time;
        Container(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }

}
