package Queue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CircularQueueTest {
    Queue<String> stringQueue;
    @Before
    public void setUp() throws Exception {
        stringQueue=new CircularQueue<String>(100,50);
        for(int i=0;i<50;i++){
            stringQueue.enQueue(String.valueOf(i));
        }
        System.out.println(stringQueue);
    }

    @Test
    public void clear() {
        stringQueue.clear();
        System.out.println(stringQueue);
    }

    @Test
    public void isEmpty() {
        System.out.println(stringQueue.isEmpty());
    }

    @Test
    public void length() {
        System.out.println(stringQueue.length());
    }

    @Test
    public void enQueue() {
        stringQueue.clear();
        for(int i=0;i<100;i++){
            stringQueue.enQueue(String.valueOf(i));
        }
        System.out.println(stringQueue);
        stringQueue.deQueue();
        stringQueue.enQueue("1000");
        stringQueue.deQueue();
        stringQueue.enQueue("1001");
        stringQueue.deQueue();
        stringQueue.deQueue();
        stringQueue.enQueue("1002");
        System.out.println(stringQueue);
        stringQueue.clear();
        for(int i=0;i<200;i++){
            stringQueue.enQueue(String.valueOf(i));
        }
        System.out.println(stringQueue);
        stringQueue.deQueue();
        stringQueue.enQueue("1000");
        stringQueue.deQueue();
        stringQueue.enQueue("1001");
        stringQueue.deQueue();
        stringQueue.deQueue();
        stringQueue.enQueue("1002");
        System.out.println(stringQueue);
    }

    @Test
    public void deQueue() {
        System.out.println(stringQueue.deQueue());
        System.out.println(stringQueue);
        System.out.println(stringQueue.deQueue());
        System.out.println(stringQueue);
        stringQueue.clear();
        System.out.println(stringQueue.deQueue());
    }
}
