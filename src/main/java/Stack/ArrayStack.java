package Stack;

public class ArrayStack<NodeType> extends Stack<NodeType> {
    NodeType[] nodes;
    int nodenumber;
    int initlength;
    int addlength;
    int head;//栈顶

    public ArrayStack(int initlength,int addlength) {
        this.initlength=initlength;
        this.addlength=addlength;
        try {
            nodenumber = 0;
            head=0;
            nodes = (NodeType[]) new Object[initlength];
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    NodeType pop() {
        if(nodenumber==0){
            return null;
        }
        nodenumber--;
        return nodes[--head];
    }

    @Override
    boolean push(NodeType node) {
        if(nodenumber==nodes.length){
            NodeType[] T= (NodeType[]) new Object[nodes.length+addlength];
            for(int i=0;i<nodes.length;i++){
                T[i]=nodes[i];
            }
            nodes=T;
        }
        nodenumber++;
        nodes[head]=node;
        head++;
        return true;
    }

    @Override
    NodeType getTop() {
        if(nodenumber==0){
            return null;
        }
        return nodes[head-1];
    }

    @Override
    boolean isEmpty() {
        return nodenumber==0;
    }

    @Override
    boolean clear() {
        try {
            nodenumber = 0;
            head=0;
            nodes = (NodeType[]) new Object[nodes.length];
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    @Override
    public String toString() {
        if(nodenumber==0){
            return "ArrayStack is empty";
        }else{
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=head-1;i>0;i--){
                stringBuilder.insert(0,","+nodes[i]);
            }
            stringBuilder.insert(0,nodes[0]);
            return "ArrayStack{"+stringBuilder+"}";
        }
    }
}
