package Graph;

public class Node<NodeNameType,NodeDataType> {
    private NodeNameType name;
    private NodeDataType data;

    public Node(NodeNameType name, NodeDataType data) {
        this.name = name;
        this.data = data;
    }

    public NodeNameType getName() {
        return name;
    }

    public void setName(NodeNameType name) {
        this.name = name;
    }

    public NodeDataType getData() {
        return data;
    }

    public void setData(NodeDataType data) {
        this.data = data;
    }
}
