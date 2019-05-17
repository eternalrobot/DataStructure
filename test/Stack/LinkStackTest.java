package Stack;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class LinkStackTest {
    Stack<String> stringStack;


    @Before
    public void setUp() throws Exception {
        stringStack=new LinkStack<String>();
        for(int i=0;i<100;i++){
            stringStack.push(String.valueOf(i));
        }
        System.out.println(stringStack);
    }

    @Test
    public void pop() {
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.push(String.valueOf(10000)));
        System.out.println(stringStack);
        for(int i=0;i<1000;i++){
            System.out.println(stringStack.pop());
        }
    }

    @Test
    public void push() {
        System.out.println(stringStack.push(String.valueOf(102123)));
    }

    @Test
    public void getTop() {
        System.out.println(stringStack.getTop());
        for(int i=0;i<1000;i++){
            stringStack.pop();
        }
        System.out.println(stringStack.getTop());
    }

    @Test
    public void isEmpty() {
        System.out.println(stringStack.isEmpty());
        for(int i=0;i<1000;i++){
            stringStack.pop();
        }
        System.out.println(stringStack.isEmpty());
    }

    @Test
    public void clear() {
        stringStack.clear();
        System.out.println(stringStack.isEmpty());
    }
}
