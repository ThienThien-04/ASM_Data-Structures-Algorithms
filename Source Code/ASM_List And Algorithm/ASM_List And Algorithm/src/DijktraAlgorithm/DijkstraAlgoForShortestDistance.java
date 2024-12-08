package DijktraAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

import static javax.swing.UIManager.put;

public class DijkstraAlgoForShortestDistance {
    static class Node implements Comparable<Node> {
        int v;
        int distance;

        public Node(int v, int distance)
        {
            this.v = v;
            this.distance = distance;
        }

        @Override public int compareTo(Node n)
        {
            if (this.distance <= n.distance) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }

    static int[] dijkstra(
            int V,
            ArrayList<ArrayList<ArrayList<Integer>> > adj,
            int S)
    {
        boolean[] visited = new boolean[V];
        HashMap<Integer, Node> map = new HashMap<>();
        PriorityQueue<Node> q = new PriorityQueue<>();

        map.put(S, new Node(S, 0));
        q.add(new Node(S, 0));

        while (!q.isEmpty()) {
            Node n = q.poll();
            int v = n.v;
            int distance = n.distance;
            visited[v] = true;

            ArrayList<ArrayList<Integer> > adjList
                    = adj.get(v);
            for (ArrayList<Integer> adjLink : adjList) {

                if (!visited[adjLink.get(0)]) {
                    if (!map.containsKey(adjLink.get(0))) {
                        map.put(
                                adjLink.get(0),
                                new Node(v,
                                        distance
                                                + adjLink.get(1)));
                    }
                    else {
                        Node sn = map.get(adjLink.get(0));
                        if (distance + adjLink.get(1)
                                < sn.distance) {
                            sn.v = v;
                            sn.distance
                                    = distance + adjLink.get(1);
                        }
                    }
                    q.add(new Node(adjLink.get(0),
                            distance
                                    + adjLink.get(1)));
                }
            }
        }

        int[] result = new int[V];
        for (int i = 0; i < V; i++) {
            result[i] = map.get(i).distance;
        }

        return result;
    }
}


