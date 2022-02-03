package Part_Two_Data_Structures_And_Algorithms.Graphs.GraphTraversal.DepthFirstTraversal;
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

        GraphTraverser.depthFirstTraversal(startingVertex, visited);
        assertEquals(
                "Check that a `for-each` loop iterates through the `start` vertex's `edges`, and the `neighbor` is the `end` vertex of each `edge`.",
                outContent.toString().trim(),
                "v0.0.0\nv1.0.0\nv1.1.0\nv1.1.1\nv1.1.2\nv1.2.0\nv1.2.1\nv2.0.0\nv2.1.0\nv2.1.1");
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

        GraphTraverser.depthFirstTraversal(startingVertex, visited);
        assertEquals(
                "Check that a `for-each` loop iterates through the `start` vertex's `edges`, and the `neighbor` is the `end` vertex of each `edge`.",
                "va.b.c", outContent.toString().trim());
    }
}
*/