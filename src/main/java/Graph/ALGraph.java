package Graph;

import java.util.Date;

public class ALGraph extends Graph {

    @Override
    boolean Adjacent(Edge e) {
        return false;
    }

    @Override
    Edge[] Neighbors(Node x) {
        return new Edge[0];
    }

    @Override
    boolean InsertVertex(Node x) {
        return false;
    }

    @Override
    boolean DeleteVertex(Node x) {
        return false;
    }

    @Override
    boolean AddEdge(Edge e) {
        return false;
    }

    @Override
    boolean RemoveEdge(Edge e) {
        return false;
    }

    @Override
    Node FirstNeighbor(Node x) {
        return null;
    }

    @Override
    Node NextNeighbor(Node x, Node y) {
        return null;
    }

    @Override
    public Node getNodeByIndex(int index) {
        return null;
    }

    @Override
    Edge getEdgeByNode(Node x, Node y) {
        return null;
    }


    @Override
    public String getGraphtype() {
        return null;
    }

    @Override
    int getIndexByNode(Node node) {
        return 0;
    }
}
