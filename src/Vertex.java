import java.util.ArrayList;

public class Vertex<I> {
    private ArrayList<Edge> edges;
    I data;
    int distance;
    private boolean isDone, isVisited;
    Vertex<I> prev;

    public Vertex() {
        this.edges = new ArrayList<>();
        this.distance = Integer.MAX_VALUE;
        isDone = false;
        isVisited = false;
    }

    public void setIsDone(boolean status){
        isDone = status;
    }

    public boolean isDone(){
        return isDone;
    }

    public boolean isVisited(){return isVisited;}

    public void setIsVisited(boolean visited){isVisited = visited;}

    public void add (Edge edge){
        edges.add(edge);
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void updateDistance(int newDistance, Vertex<I> v){
        if (newDistance <= distance){
            prev = v;
            distance = newDistance;
        }
    }

    public String toString(){
        return data.toString();
    }
}
