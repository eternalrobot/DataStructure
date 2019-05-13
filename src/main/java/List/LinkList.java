package List;

public class LinkList<NodeType> extends List<NodeType> {
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

    private Node head;
    private int nodenumber;

    public LinkList() {
        this.head = new Node(null, null);
        nodenumber = 0;
    }

    @Override
    boolean clear() {
        this.head = new Node(null, null);
        nodenumber = 0;
        return false;
    }

    @Override
    int length() {
        return nodenumber;
    }

    @Override
    boolean isEmpty() {
        return nodenumber == 0;
    }

    @Override
    NodeType get(int i) {
        Node T = getNode(i);
        if (T != null) {
            return T.data;
        }
        return null;
    }

    private Node getNode(int i) {
        if (i < 1 || i > nodenumber) {
            return null;
        }
        Node T = head;
        for (; i > 0; i--) {
            if (T.next != null) {
                T = T.next;
            } else {
                return null;
            }
        }
        return T;
    }


    @Override
    boolean delete(int i) {
        if (i < 1 || i > nodenumber) {
            return false;
        }
        if (i == 1) {
            Node T = getNode(i);
            Node PriorNode = head;
            head = T.next;
        } else {
            Node T = getNode(i);
            Node PriorNode = getNode(i - 1);
            PriorNode.next = T.next;
        }
        return true;
    }

    @Override
    NodeType Prior(int i) {
        if (i < 1 || i > nodenumber) {
            return null;
        }
        return get(i - 1);
    }

    @Override
    NodeType Next(int i) {
        if (i < 1 || i > nodenumber) {
            return null;
        }
        return get(i + 1);
    }

    @Override
    boolean insert(int i, NodeType node) {
        if(i<1||i>nodenumber+1){
            return false;
        }
        Node T;
        if(i==1){
            T=head;
        }
        else{
            T=getNode(i-1);
        }
        Node newNode=new Node(node,null);
        newNode.next=T.next;
        T.next=newNode;
        nodenumber++;
        return true;
    }

    @Override
    int locate(NodeType node) {
        Node T = head;
        int i = 0;
        for (; T!= null; T = T.next) {
            i++;
            if (node == T.data) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if(nodenumber!=0){
            StringBuilder stringBuilder=new StringBuilder();
            Node T=head.next;
            for(;T.next!=null;T=T.next){
                stringBuilder.append(T.data+",");
            }
            stringBuilder.append(T.data);
            return "LinkList{"+stringBuilder+"}";
        }
        else{
            return "LinkList is empty";
        }
    }
}
