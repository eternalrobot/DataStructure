package Graph;

public abstract class GraphUtils {
    public interface multiNode<T_retuen>{
        T_retuen multiNode(Node node);
    }
    abstract public void DFS(Graph G,multiNode m);
}
