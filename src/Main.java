import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        if (args.length<1) {
            System.out.println("USAGE: java Main <start node number>");
            System.exit(0);
        }
        ReadFile L7g1 = new ReadFile("http://www.iie.ntnu.no/fag/_alg/uv-graf/L7g1");
        BufferedReader readerL7g1 = L7g1.reader();
        Graph graphL7g1 = new Graph(readerL7g1);
        Vertex<Integer> startL7g11 = graphL7g1.getVertex(Integer.parseInt(args[0]));
        if (startL7g11 != null) {
            System.out.println("BFS starter på node " + startL7g11 + " på graf L7g1:");
            graphL7g1.bfs(startL7g11);
            graphL7g1.printGraph();
            System.out.println("\n");
        }

        ReadFile L7g12 = new ReadFile("http://www.iie.ntnu.no/fag/_alg/uv-graf/L7g1");
        BufferedReader readerL7g12 = L7g12.reader();
        Graph graphL7g12 = new Graph(readerL7g12);
        Vertex<Integer> startL7g12 = graphL7g12.getVertex(0);
        if (startL7g12 != null) {
            System.out.println("BFS starter på node " + startL7g12 + " på graf L7g1:");
            graphL7g12.bfs(startL7g12);
            graphL7g12.printGraph();
            System.out.println("\n");
        }

        ReadFile L7g2 = new ReadFile("http://www.iie.ntnu.no/fag/_alg/uv-graf/L7g2");
        BufferedReader readerL7g2 = L7g2.reader();
        Graph graphL7g2 = new Graph(readerL7g2);
        Vertex<Integer> startL7g2 = graphL7g2.getVertex(Integer.parseInt(args[0]));
        if (startL7g2 != null){
            System.out.println("BFS starter på node " + startL7g2 + " på graf L7g2:");
            graphL7g2.bfs(startL7g2);
            graphL7g2.printGraph();
            System.out.println("\n");
        }


        ReadFile L7g3 = new ReadFile("http://www.iie.ntnu.no/fag/_alg/uv-graf/L7g3");
        BufferedReader readerL7g3 = L7g3.reader();
        Graph graphL7g3 = new Graph(readerL7g3);
        Vertex<Integer> startL7g3 = graphL7g3.getVertex(Integer.parseInt(args[0]));
        if (startL7g3 != null){
            System.out.println("BFS starter på node " + startL7g3 + " på graf L7g3:");
            graphL7g3.bfs(startL7g3);
            graphL7g3.printGraph();
            System.out.println("\n");
        }

        ReadFile L7g5 = new ReadFile("http://www.iie.ntnu.no/fag/_alg/uv-graf/L7g5");
        BufferedReader readerL7g5 = L7g5.reader();
        Graph graphL7g5 = new Graph(readerL7g5);
        Vertex<Integer> startL7g5 = graphL7g5.getVertex(Integer.parseInt(args[0]));
        if (startL7g5 != null){
            System.out.println("BFS starter på node " + startL7g5 + " på graf L7g5:");
            graphL7g5.bfs(startL7g5);
            graphL7g5.printGraph();
            System.out.println("\n");
        }

        System.out.println("Topologisk sort på graf L7g5: ");
        graphL7g5.topologicalSort();
        System.out.println("\n");
    }
}
