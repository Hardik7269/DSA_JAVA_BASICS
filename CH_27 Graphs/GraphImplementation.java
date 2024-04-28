import java.util.*;

class GraphImplementation {
    public static class Edge {
        int src;
        int destination;
        int weight;

        public Edge(int src, int destination, int weight) {
            this.src = src;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "(" + src + " -> " + destination + ", weight=" + weight + ")";
        }
    }

    public static void printGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + " : ");
            for (Edge edge : graph[i]) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Vertex = 5;
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        for (int i = 0; i < Vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1, 0, 5));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));

        printGraph(graph);
    }
}
