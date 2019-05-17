package Queue;

public class LinkQueue<NodeType> extends Queue<NodeType> {
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

    private int nodenumber;//节点数量
    private Node head;//队头
    private Node tail;//队尾

    public LinkQueue() {
        head=new Node(null,null);
        tail=head;
        nodenumber=0;
    }

    @Override
    boolean clear() {
        head=new Node(null,null);
        tail=head;
        nodenumber=0;
        return true;
    }

    @Override
    boolean isEmpty() {
        return nodenumber==0;
    }

    @Override
    int length() {
        return nodenumber;
    }

    @Override
    boolean enQueue(NodeType node) {
        Node T=new Node(node,null);
        tail.next=T;
        tail=T;
        nodenumber++;
        return true;
    }

    @Override
    NodeType deQueue() {
        if(nodenumber==0){
            return null;
        }
        NodeType result=head.next.data;
        head.next=head.next.next;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        if (nodenumber != 0) {
            Node T=head.next;
            for(;T.next!=null;T=T.next){
                stringBuilder.append(T.data+",");
            }
            stringBuilder.append(T.data);
            return "LinkQueue{"+stringBuilder+"}";
        } else {
            return "LinkQueue is empty";
        }
    }
}
