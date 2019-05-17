package Stack;

public abstract class Stack<NodeType> {

    /*
     * @description 出栈
     * @return 出栈数据 null表明出栈失败
     */
    abstract NodeType pop();

    /*
     * @description 入栈
     * @return true入栈成功，false入栈失败
     */
    abstract boolean push(NodeType node);

    /*
     * @description 获得栈顶元素
     * @return null获得失败，其余成功
     */
    abstract NodeType getTop();

    /*
     * @description 判断是否空列表
     * @return  true 空，false 不空
     */
    abstract boolean isEmpty();

    /*
     * @description 清空栈
     * @return true 清空成功，false 清空失败
     */
    abstract boolean clear();

}
