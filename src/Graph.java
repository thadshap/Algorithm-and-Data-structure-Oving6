import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Graph {
    int N, K;
    Vertex<Integer>[] vertices;

    public Graph(BufferedReader reader) throws IOException {
        createGraph(reader);
    }

    public Vertex<Integer> getVertex(int value) {
        for (Vertex<Integer> v : vertices){
            if (v.data == value) return v;
        }
        return null;
    }

    private void createGraph(BufferedReader br) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        vertices = new Vertex[N];
        for (int i = 0; i<N; i++){
            vertices[i]=new Vertex<Integer>();
            vertices[i].data = i;
        }
        K = Integer.parseInt(st.nextToken());
        for (int i = 0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            Edge e = new Edge(vertices[from], vertices[to]);
            vertices[from].add(e);
        }
    }

    public void bfs(Vertex<Integer> s){
        s.updateDistance(0,null);
        Queue<Vertex<Integer>> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()){
            Vertex<Integer> v = queue.remove();
            v.setIsDone(true);
            v.getEdges().forEach(e -> {
                if (!e.to.isDone()) {
                    e.to.updateDistance(v.distance + 1,v);
                    queue.add(e.to);
                }
            });
        }
    }

    public void printGraph() {
        System.out.println("Node Forgj Dist");
        for (Vertex<Integer> v : vertices){
            System.out.printf("%4s %5s %4s\n", v, v.prev, v.distance);
        }
    }

    public void topologicalSort() {
        Stack<Vertex<Integer>> stack = new Stack<>();

        for (Vertex v : vertices)
            if (!v.isVisited())
                topsortRec(v, stack);

        printTopsort(stack);
    }

    private void topsortRec(Vertex<Integer> v, Stack<Vertex<Integer>> stack){
        v.setIsVisited(true);

        v.getEdges().forEach(edge -> {
            if (!edge.to.isVisited()) {
                topsortRec(edge.to, stack);
            }
        });

        stack.push(v);
    }

    private void printTopsort(Stack<Vertex<Integer>> stack){
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
