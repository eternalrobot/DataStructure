package List;

import Graph.Node;

public class ArrayList<NodeType> extends List<NodeType> {
    private NodeType[] nodes;//线性表的Nodes
    private int initlength = 100;
    private int addlength = 50;
    private int nodenumber;//节点数量

    public ArrayList() {
        try {
            nodenumber = 0;
            nodes = (NodeType[]) new Object[initlength];
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    boolean clear() {
        try {
            nodes = (NodeType[]) new Object[initlength];
            nodenumber = 0;
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
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
        if (i < 1 || i > nodenumber) {
            return null;
        } else {
            return nodes[i - 1];
        }
    }

    @Override
    boolean delete(int i) {
        if (i < 1 || i > nodenumber) {
            return false;
        } else {
//            for(int j=i;j<nodenumber;j++){
//                nodes[j-1]=nodes[j];
//            }
//            下面代码就是上面代码的简单版本
            System.arraycopy(nodes, i, nodes, i - 1, nodenumber - i);
            nodenumber--;
        }
        return true;
    }

    @Override
    NodeType Prior(int i) {
        if (i < 2 || i > nodenumber) {
            return null;
        } else {
            return nodes[i - 2];
        }
    }

    @Override
    NodeType Next(int i) {
        if (i < 1 || i > nodenumber - 1) {
            return null;
        } else {
            return nodes[i];
        }
    }

    @Override
    boolean insert(int i, NodeType node) {
        if (i < 1 || i > nodenumber+1) {
            return false;
        }
        if (nodenumber == nodes.length) {
            NodeType[] T;
            try {
                T = (NodeType[]) new Object[nodenumber + addlength];
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
            for (int j = 0; j < nodenumber; j++) {
                T[j] = nodes[j];
            }
            nodes = T;
        }
        for (int j = nodenumber; j >= i; j--) {
            nodes[j] = nodes[j - 1];
        }
        nodes[i - 1] = node;
        nodenumber++;
        return true;
    }

    @Override
    int locate(NodeType node) {
        for (int i = 0; i < nodenumber; i++) {
            if (node == nodes[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (nodenumber != 0) {
            for (int i = 0; i < nodenumber - 1; i++) {
                stringBuilder.append(nodes[i] + ",");
            }
            stringBuilder.append(nodes[nodenumber - 1]);
            return "ArrayList{" + stringBuilder + "}";
        } else {
            return "ArrayList is empty";
        }
    }
}
