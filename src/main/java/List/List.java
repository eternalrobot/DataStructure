package List;

public abstract class List<NodeType>{
    /*
    * @description 清空列表
    * @return true 清空成功，false 清空失败
     */
    abstract boolean clear();

    /*
    * @description 获得长度
    * @return 长度
     */
    abstract int length();

    /*
    * @description 判断是否空列表
    * @return true 空，false 不空
     */
    abstract boolean isEmpty();

    /*
    * @description 获得第i位置的节点
    * @param i 第i位置
    * @return null表明获得失败，非null表明是这个位置的元素
     */
    abstract NodeType get(int i);

    /*
    * @description 删除第i位置的节点
    * @param i 第i位置
    * @return true 删除成功，false删除失败
    */
    abstract boolean delete(int i);

    /*
    * @description 获得前驱
    * @param i 第i位置
    * @return null表明获得失败，非null表明是这个位置的前驱元素
     */
    abstract NodeType Prior(int i);

    /*
    * @description 获得后继
    * @param i 第i位置
    * @return null表明获得失败，非null表明是这个位置的后继元素
     */
    abstract NodeType Next(int i);

    /*
    * @description 在线性表中第i个位置之前插入新的元素e
    * @param i 插入位置，node插入的节点
    * @return true 插入成功，false 插入失败
     */
    abstract boolean insert(int i,NodeType node);

    /*
    * @description 定位node的位置i
    * @param node 需要定位的node
    * @return -1表明没有找到，其余为找到的位置
     */
    abstract int locate(NodeType node);
}
