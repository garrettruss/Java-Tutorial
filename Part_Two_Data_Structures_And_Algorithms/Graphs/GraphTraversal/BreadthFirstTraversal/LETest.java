package Part_Two_Data_Structures_And_Algorithms.Graphs.GraphTraversal.BreadthFirstTraversal;
/*
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;
import java.util.ArrayList;

public class LETest {
    @Test
    public void vertexStartParameterEdges() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        TestGraph test = new TestGraph();
        Vertex startingVertex = test.getStartingVertex();
        ArrayList<Vertex> visited = new ArrayList<Vertex>();
        visited.add(startingVertex);

        GraphTraverser.breadthFirstTraversal(startingVertex, visited);
        assertEquals(
                "Make sure that the `current` vertex is set to the vertex that is dequeued from the `visitQueue`, and its data is printed.",
                outContent.toString().trim(),
                "v0.0.0\nv1.0.0\nv2.0.0\nv1.1.0\nv1.2.0\nv2.1.0\nv1.1.1\nv1.1.2\nv1.2.1\nv2.1.1");
    }

    @Test
    public void vertexStartParameterNoEdges() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Graph testGraph = new Graph(true, true);
        Vertex startingVertex = testGraph.addVertex("va.b.c");
        ArrayList<Vertex> visited = new ArrayList<Vertex>();
        visited.add(startingVertex);

        GraphTraverser.breadthFirstTraversal(startingVertex, visited);
        assertEquals(
                "Make sure that the `current` vertex is set to the vertex that is dequeued from the `visitQueue`, and its data is printed.",
                outContent.toString().trim(), "va.b.c");
    }
}
*/