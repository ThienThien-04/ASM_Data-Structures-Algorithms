package DijktraAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<ArrayList<Integer> > > adj
                = new ArrayList<>();
        HashMap<Integer, ArrayList<ArrayList<Integer> > >
                map = new HashMap<>();

        int V = 6;
        int E = 5;
        int[] u = { 0, 0, 1, 2, 4 };
        int[] v = { 3, 5, 4, 5, 5 };
        int[] w = { 9, 4, 4, 10, 3 };

        for (int i = 0; i < E; i++) {
            ArrayList<Integer> edge = new ArrayList<>();
            edge.add(v[i]);
            edge.add(w[i]);

            ArrayList<ArrayList<Integer> > adjList;
            if (!map.containsKey(u[i])) {
                adjList = new ArrayList<>();
            }
            else {
                adjList = map.get(u[i]);
            }
            adjList.add(edge);
            map.put(u[i], adjList);

            ArrayList<Integer> edge2 = new ArrayList<>();
            edge2.add(u[i]);
            edge2.add(w[i]);

            ArrayList<ArrayList<Integer> > adjList2;
            if (!map.containsKey(v[i])) {
                adjList2 = new ArrayList<>();
            }
            else {
                adjList2 = map.get(v[i]);
            }
            adjList2.add(edge2);
            map.put(v[i], adjList2);
        }

        for (int i = 0; i < V; i++) {
            if (map.containsKey(i)) {
                adj.add(map.get(i));
            }
            else {
                adj.add(null);
            }
        }
        int S = 1;

        // Input sample
        //[0 [[3, 9], [5, 4]],
        // 1 [[4, 4]],
        // 2 [[5, 10]],
        // 3 [[0, 9]],
        // 4 [[1, 4], [5, 3]],
        // 5 [[0, 4], [2, 10], [4, 3]]
        //]
        int[] result
                = DijkstraAlgoForShortestDistance.dijkstra(
                V, adj, S);
        System.out.println(Arrays.toString(result));
    }
}
