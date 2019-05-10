package Graph;


public class GraphUtilsImpl extends GraphUtils {

    @Override
    public void DFS(Graph G, multiNode m) {
        boolean[] visited=new boolean[G.nodenumber];
        for(int i=0;i<G.nodenumber;i++){
            visited[i]=false;
        }
        for(int i=0;i<G.nodenumber;i++){
            if(!visited[i]){
                helpDFS(G.getNodeByIndex(i),m,G,visited,i);
            }
        }
    }

    private void helpDFS(Node node,multiNode m,Graph G,boolean[] visited,int visit){
        m.multiNode(node);
        visited[visit]=true;
        for(Node w=G.FirstNeighbor(node);w!=null;w=G.NextNeighbor(node,w)){
            visit=G.getIndexByNode(w);
            if(!visited[visit]){
                helpDFS(w,m,G,visited,visit);
            }
        }
    }
}
