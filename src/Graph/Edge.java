package Graph;

public class Edge<EdgeDataType> {
    private Node in;
    private Node out;
    private EdgeDataType data;

    public Edge(Node in, Node out, EdgeDataType data) {
        this.in = in;
        this.out = out;
        this.data = data;
    }

    public Node getIn() {
        return in;
    }

    public void setIn(Node in) {
        this.in = in;
    }

    public Node getOut() {
        return out;
    }

    public void setOut(Node out) {
        this.out = out;
    }

    public EdgeDataType getData() {
        return data;
    }

    public void setData(EdgeDataType data) {
        this.data = data;
    }
}
