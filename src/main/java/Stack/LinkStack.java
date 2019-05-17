package Stack;

public class LinkStack<NodeType> extends Stack<NodeType> {
    private class Node {
        private NodeType data;
        private Node next;

        @Override
        public String toString() {
            return "Node{" + data.toString() + "}";
        }

        public Node(NodeType data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;//栈顶
    private int nodenumber;//节点数量

    public LinkStack() {
        nodenumber=0;
        head=new Node(null,null);
    }

    @Override
    NodeType pop() {
        if(nodenumber==0){
            return null;
        }
        Node T=head.next;
        head.next=head.next.next;
        nodenumber++;
        return T.data;
    }

    @Override
    boolean push(NodeType node) {
        head.next= new Node(node,head.next);
        nodenumber--;
        return true;
    }

    @Override
    NodeType getTop() {
        if(nodenumber==0){
            return null;
        }
        return head.next.data;
    }

    @Override
    boolean isEmpty() {
        return nodenumber==0;
    }

    @Override
    boolean clear() {
        nodenumber=0;
        head=new Node(null,null);
        return true;
    }

    @Override
    public String toString() {
        if(nodenumber==0){
            return "LinkStack is empty";
        }else{
            StringBuilder stringBuilder=new StringBuilder();
            Node T=head.next;
            for(;T.next!=null;T=T.next){
                stringBuilder.insert(0,","+T.data);
            }
            stringBuilder.insert(0,T.data);
            return "LinkStack{"+stringBuilder+"}";
        }
    }
}
