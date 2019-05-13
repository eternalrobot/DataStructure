package Queue;

public abstract class Queue<NodeType> {
    /*
     * @description 清空队列
     * @return true 清空成功，false 清空失败
     */
    abstract boolean clear();

    /*
     * @description 判断是否空列表
     * @return true 空，false 不空
     */
    abstract boolean isEmpty();

    /*
     * @description 获得长度
     * @return 长度
     */
    abstract int length();

    /*
    * @description 在队尾插入元素
    * @param node 插入的元素
    * @return 返回true插入成功，返回false插入失败
     */
    abstract boolean enQueue(NodeType node);

    /*
    * @description 从队头取出元素
    * @return 返回null表明没有元素了，无法去除，其余是取出的元素
     */
    abstract NodeType deQueue();
}
