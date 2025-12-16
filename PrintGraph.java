// User function Template for Java
import java.util.*;

class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];

            res.get(v1).add(v2);
            res.get(v2).add(v1);
        }

        return res;
    }
}
