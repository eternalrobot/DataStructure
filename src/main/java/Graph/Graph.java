package Graph;

public abstract class Graph {
    int nodenumber;
    int edgenumber;
    String graphtype;//有效输入WXT（无向图），YXT（有向图）

    /*
    * @description 判断是否图G存在边e或e
     */
    abstract boolean Adjacent(Edge e);

    /*
    *@description 列出图G中与节点x邻接的边
     */
    abstract Edge[] Neighbors(Node x);

    /*
    *@description 在图G中插入顶点x
     */
    abstract boolean InsertVertex(Node x);

    /*
    *@description 在图G中删除顶点x
     */
    abstract boolean DeleteVertex(Node x);

    /*
    *@description 若无向边e或有向边e不存在，则向图G中添加该边
     */
    abstract boolean AddEdge(Edge e);

    /*
    *@description 删除边e
     */
    abstract boolean RemoveEdge(Edge e);

    /*
    *@description 获得第一个邻接点
     */
    abstract Node FirstNeighbor(Node x);

    /*
    *@description 获得相对于y的下一个邻接点
     */
    abstract Node NextNeighbor(Node x,Node y);

    /*
    *@description 获得index的node
     */
    abstract Node getNodeByIndex(int index);

    /*
    *@description 获得node的edge
     */
    abstract Edge getEdgeByNode(Node x, Node y);

    /*
    *@description 获得图的类型
     */
    abstract String getGraphtype();

    /*
    *@description 通过node获得其index
     */
    abstract int getIndexByNode(Node node);
}

