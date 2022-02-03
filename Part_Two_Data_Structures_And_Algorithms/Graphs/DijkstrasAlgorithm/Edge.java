package Part_Two_Data_Structures_And_Algorithms.Graphs.DijkstrasAlgorithm;

public class Edge {
    private Vertex start;
    private Vertex end;
    private int weight;

    public Edge(Vertex startV, Vertex endV, int inputWeight) {
        this.start = startV;
        this.end = endV;
        this.weight = inputWeight;
    }

    public Vertex getStart() {
        return this.start;
    }

    public Vertex getEnd() {
        return this.end;
    }

    public int getWeight() {
        return this.weight;
    }

}