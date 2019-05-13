package Queue;

public class CircularQueue<NodeType> extends Queue<NodeType>{
    private NodeType[] nodes;//节点数组
    private int nodenumber;//节点数量
    private int tail;//队尾指针
    private int head;//队头指针
    private int initlength;//初始最大容量
    private int addlength;//每次增加容量

    public CircularQueue(int initlength,int addlength) {
        this.initlength=initlength;
        this.addlength=addlength;
        try {
            nodenumber = 0;
            tail=0;
            head=0;
            nodes = (NodeType[]) new Object[initlength];
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    boolean clear() {
        tail=0;
        head=0;
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
        if(isEmpty()!=true&&head==tail){
            try {
                CircularQueue<NodeType> T=new CircularQueue<NodeType>(nodes.length+addlength,addlength);
                while (!this.isEmpty()){
                    T.enQueue(this.deQueue());
                }
                this.nodes=T.nodes;
                this.head=T.head;
                this.nodenumber=T.nodenumber;
                this.tail=T.tail;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }
        nodes[tail]=node;
        tail=(tail+1)%nodes.length;
        nodenumber++;
        return true;
    }

    @Override
    NodeType deQueue() {
        if(isEmpty()==true){
            return null;
        }
        NodeType T=nodes[head];
        head=(head+1)%nodes.length;
        nodenumber--;
        return T;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        if (nodenumber != 0) {
            int Thead=head;
            int Ttail=tail;
            for (; (Thead+1)%nodes.length!=Ttail; Thead=(Thead+1)%nodes.length) {
                stringBuilder.append(nodes[Thead] + ",");
            }
            stringBuilder.append(nodes[(Thead)%nodes.length]);
            return "CircularQueue{"+stringBuilder+"},head{"+String.valueOf(head)+"},tail{"+String .valueOf(tail)+"}";
        } else {
            return "CircularQueue is empty,head{"+String.valueOf(head)+"},tail{"+String .valueOf(tail)+"}";
        }
    }
}
