package Part_Two_Data_Structures_And_Algorithms.Graphs.GraphImplimentation;

public class TrainNetwork {
    public static void main(String[] args) {
        Graph trainNetwork = new Graph(true, true);
        Vertex losAngelesStation = trainNetwork.addVertex("Los Angeles");
        Vertex sanFranciscoStation = trainNetwork.addVertex("San Francisco");
        Vertex newYorkStation = trainNetwork.addVertex("New York");
        Vertex atlantaStation = trainNetwork.addVertex("Atlanta");
        Vertex denverStation = trainNetwork.addVertex("Denver");
        Vertex calgaryStation = trainNetwork.addVertex("Calgary");

        trainNetwork.addEdge(sanFranciscoStation, losAngelesStation, 400);
        trainNetwork.addEdge(losAngelesStation, sanFranciscoStation, 400);
        trainNetwork.addEdge(newYorkStation, denverStation, 1800);
        trainNetwork.addEdge(denverStation, newYorkStation, 1800);
        trainNetwork.addEdge(calgaryStation, denverStation, 1000);
        trainNetwork.addEdge(denverStation, calgaryStation, 1000);
        trainNetwork.addEdge(losAngelesStation, atlantaStation, 2100);
        trainNetwork.addEdge(atlantaStation, losAngelesStation, 2100);

        trainNetwork.removeEdge(newYorkStation, denverStation);
        trainNetwork.removeEdge(calgaryStation, denverStation);
        trainNetwork.removeEdge(denverStation, calgaryStation);
        trainNetwork.removeVertex(calgaryStation);

        trainNetwork.print();
    }
}