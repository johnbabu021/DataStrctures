import java.util.*;

public class Graph<T> {

    private Map<T, List<T>> map = new HashMap<>();

    private void addVertex(T data) {
        map.put(data, new ArrayList<>());

    }

    public void insert(T vertex, T edge, boolean isBidirectional) {
        if (!map.containsKey(vertex)) {
            addVertex(vertex);
        }
        if (!map.containsKey(edge)) {
            addVertex(edge);
        }

        map.get(vertex).add(edge);
        if (isBidirectional) {
            map.get(edge).add(vertex);

        }
    }

    public void display() {

        for (T x : map.keySet()) {
            System.out.print(x + ": ");
            for (T y : map.get(x)) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Graph<String> graph = new Graph<>();

        graph.insert("mammad", "muhammed", true);
        graph.insert("njan", "avar", true);
        graph.insert("they", "you", true);
        graph.insert("are", "how", false);
        graph.display();

    }
}
