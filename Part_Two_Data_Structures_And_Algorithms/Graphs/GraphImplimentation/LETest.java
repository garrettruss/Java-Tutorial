package Part_Two_Data_Structures_And_Algorithms.Graphs.GraphImplimentation;
/*
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class LETest {
    @Test
    public void removeVertexEdge() {
        Vertex v1 = new Vertex("test 1");
        Vertex v2 = new Vertex("test 2");
        Vertex v3 = new Vertex("test 3");
        v1.addEdge(v2);
        v2.addEdge(v1);
        v1.addEdge(v3);
        v3.addEdge(v1);

        v1.removeEdge(v2);

        ArrayList<Edge> v1Edges = v1.getEdges();
        ArrayList<Edge> v2Edges = v2.getEdges();
        ArrayList<Edge> v3Edges = v3.getEdges();

        assertEquals("The vertex should only remove edges that are connected to the `endVertex` parameter.", 1,
                v1Edges.size());
        assertEquals(
                "Check that you are not modifying any other vertices' edges. Only `this` vertex's `edges` should be modified.",
                1, v2Edges.size());
        assertEquals(
                "Check that you are not modifying any other vertices' edges. Only `this` vertex's `edges` should be modified.",
                1, v3Edges.size());

        // check v1 edges
        Edge v1Edge = v1Edges.get(0);
        assertEquals("Check that `.removeEdge()` only removes edges connected to the `endVertex` parameter.", v1,
                v1Edge.getStart());
        assertEquals("Check that `.removeEdge()` only removes edges connected to the `endVertex` parameter.", v3,
                v1Edge.getEnd());

        // check v2 edges
        Edge v2Edge = v2Edges.get(0);
        assertEquals(
                "Check that you are not modifying any other vertices' edges. Only `this` vertex's `edges` should be modified.",
                v2, v2Edge.getStart());
        assertEquals(
                "Check that you are not modifying any other vertices' edges. Only `this` vertex's `edges` should be modified.",
                v1, v2Edge.getEnd());

        // check v3 edges
        Edge v3Edge = v3Edges.get(0);
        assertEquals(
                "Check that you are not modifying any other vertices' edges. Only `this` vertex's `edges` should be modified.",
                v3, v3Edge.getStart());
        assertEquals(
                "Check that you are not modifying any other vertices' edges. Only `this` vertex's `edges` should be modified.",
                v1, v3Edge.getEnd());
    }
}
*/