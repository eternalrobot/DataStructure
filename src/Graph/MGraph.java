package Graph;

import java.util.Arrays;

public class MGraph extends Graph {
    private Node[] nodes;
    private Edge[][] edges;

    public MGraph(String graphtype) {
        this.graphtype = graphtype;
        nodes = new Node[0];
        edges = new Edge[0][0];
        nodenumber = 0;
        edgenumber = 0;
    }

    @Override
    boolean Adjacent(Edge e) {
        int i = getIndexByNode(e.getIn()), j = getIndexByNode(e.getOut());
        return edges[i][j].getData() != null || edges[j][i].getData() != null;
    }

    @Override
    Edge[] Neighbors(Node x) {
        int i = getIndexByNode(x), j = 0;
        Edge[] neighbors = new Edge[edges.length];
        int k = 0;
        for (j = 0; j < nodes.length; j++) {
            if (edges[i][j].getData() != null) {
                neighbors[k++] = edges[i][j];
            }
        }
        neighbors[k] = null;//最后一个为null来标志结束
        return neighbors;
    }

    @Override
    boolean InsertVertex(Node x) {
        Node[] newnodes = new Node[nodes.length + 1];
        Edge[][] newedges = new Edge[edges.length + 1][edges.length + 1];
        for (int i = 0; i < nodes.length; i++) {
            newnodes[i] = nodes[i];
            System.arraycopy(edges[i], 0, newedges[i], 0, edges.length);
        }
        newnodes[nodes.length] = x;
        for (int j = 0; j < edges.length + 1; j++) {
            newedges[edges.length][j] = new Edge(newnodes[edges.length], newnodes[j], null);
            newedges[j][edges.length] = new Edge(newnodes[j], newnodes[edges.length], null);
        }
        nodes = newnodes;
        edges = newedges;
        nodenumber++;
        return true;
    }

    @Override
    boolean DeleteVertex(Node x) {
        Node[] newnodes = new Node[nodes.length - 1];
        Edge[][] newedges = new Edge[edges.length - 1][edges.length - 1];
        int xindex = getIndexByNode(x);
        for (int i = 0, m = 0; i < nodes.length; i++) {
            if (i == xindex) {
                continue;
            }
            newnodes[m++] = nodes[i];
        }
        for (int i = 0, m = 0; i < edges.length; i++) {
            if (i == xindex) {
                continue;
            }
            for (int j = 0, n = 0; j < edges.length; j++) {
                if (j == xindex) {
                    continue;
                }
                newedges[m][n] = edges[i][j];
                n++;
            }
            m++;
        }
        nodes = newnodes;
        edges = newedges;
        nodenumber--;
        return true;
    }

    @Override
    boolean AddEdge(Edge e) {
        int iindex = getIndexByNode(e.getIn());
        int jindex = getIndexByNode(e.getOut());
        if (graphtype.equals("WXT")) {
            edges[iindex][jindex] = e;
            edges[jindex][iindex].setData(e.getData());
        } else if (graphtype.equals("YXT")) {
            edges[iindex][jindex] = e;
        }
        edgenumber++;
        return true;
    }

    @Override
    boolean RemoveEdge(Edge e) {
        int iindex = getIndexByNode(e.getIn());
        int jindex = getIndexByNode(e.getOut());
        if (graphtype.equals("WXT")) {
            edges[iindex][jindex].setData(null);
            edges[jindex][iindex].setData(null);
        } else if (graphtype.equals("YXT")) {
            edges[iindex][jindex].setData(null);
        }
        edgenumber--;
        return true;
    }

    @Override
    Node FirstNeighbor(Node x) {
        int iindex = getIndexByNode(x);
        return edges[iindex][0].getOut();
    }

    @Override
    Node NextNeighbor(Node x, Node y) {
        int iindex = getIndexByNode(x);
        int jindex = getIndexByNode(y);
        jindex++;
        if (jindex==(edges.length)) {
            return null;
        }
        while(edges[iindex][jindex].getData()==null){
            jindex++;
            if (jindex==(edges.length)) {
                return null;
            }
        }
        return edges[iindex][jindex].getOut();
    }

    public int getIndexByNode(Node node) {
        int xindex = -1;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].getName().equals(node.getName())) {
                xindex = i;
                break;
            }
        }
        return xindex;
    }


    public Node getNodeByIndex(int index) {
        return nodes[index];
    }

    public Edge getEdgeByNode(Node x, Node y) {
        return edges[getIndexByNode(x)][getIndexByNode(y)];
    }

    public String getGraphtype() {
        return graphtype;
    }

    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();

        result.append("************\n");
        result.append("nodes:\n");
        for(int i=0;i<nodes.length-1;i++){
            result.append(nodes[i].getName()+" | ");
        }
        result.append(nodes[nodes.length-1].getName()+"\n");

        result.append("edges:\n");
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges.length;j++){
                if(edges[i][j].getData()==null){
                    result.append("0 | ");
                }
                else{
                    result.append(edges[i][j].getData()+" | ");
                }
            }
            result.append("\n");
        }

        result.append("************\n");
        return result.toString();
    }
}
