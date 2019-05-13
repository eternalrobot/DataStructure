package Graph;

public abstract class GraphUtils {
    public interface multiNode<T_retuen>{
        T_retuen multiNode(Node node);
    }

    /*
    *@description 深度搜索图，对搜索到的每个节点执行multiNode方法
     */
    abstract public void DFS(Graph G,multiNode m);
}
