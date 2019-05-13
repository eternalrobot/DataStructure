package Graph;

public class MGraphTest {

    public static boolean thetext(Node node){
        System.out.println(node.getData());
        return true;
    }

    public static void main(String[] args){
        Graph graph=new MGraph("WXT");
        Node<String,String> x=new Node<String,String>("x","xdata");
        Node<String,String> y=new Node<String,String>("y","ydata") ;
        Node<String,String> z=new Node<String,String>("z","zdata");
        Node<String,String> a=new Node<String,String>("a","adata");
        graph.InsertVertex(z);
        graph.InsertVertex(a);
        graph.InsertVertex(y);
        graph.InsertVertex(x);
        Edge<String> edge=new Edge<String>(a,y,"ay");
        Edge<String> edge1=new Edge<String>(a,x,"ax");
        Edge<String> edge2=new Edge<String>(x,z,"zx");
        System.out.println(graph.Adjacent(edge));
        graph.AddEdge(edge);
        graph.AddEdge(edge1);
        graph.AddEdge(edge2);
        System.out.println(graph.Adjacent(edge));
        GraphUtils graphUtils=new GraphUtilsImpl();
        graphUtils.DFS(graph,MGraphTest::thetext);
        System.out.println(graph);
    }
}
