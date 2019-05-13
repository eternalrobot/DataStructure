package List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class ArrayListTest {
    List<String> stringList;

    @Before
    public void before(){
        stringList=new ArrayList<String>();
        for(int i=1;i<50;i++){
            stringList.insert(i,String.valueOf(i));
        }
        for(int i=1;i<10;i++){
            stringList.insert(i,String.valueOf(i));
        }
    }

    @Test
    public void clear() {
        stringList.clear();
        System.out.println(stringList);
    }

    @Test
    public void length() {
        System.out.println(stringList.length());
    }

    @Test
    public void isEmpty() {
        System.out.println(stringList.isEmpty());
    }

    @Test
    public void get() {
        for(int i=1;i<=stringList.length();i++){
            System.out.println(stringList.get(i));
        }
    }

    @Test
    public void delete() {
        stringList.delete(0);
        stringList.delete(stringList.length()+1);
        stringList.delete(stringList.length());
        stringList.delete(1);
        System.out.println(stringList);
    }

    @Test
    public void prior() {
        System.out.println(stringList.Prior(0));
        System.out.println(stringList.Prior(stringList.length()+1));
        System.out.println(stringList.Prior(1));
        System.out.println(stringList.Prior(stringList.length()));
    }

    @Test
    public void next() {
        System.out.println(stringList.Next(0));
        System.out.println(stringList.Next(stringList.length()+1));
        System.out.println(stringList.Next(1));
        System.out.println(stringList.Next(stringList.length()));
    }

    @Test
    public void insert() {
        stringList.clear();
        for(int i=1;i<20;i++){
            stringList.insert(i,String.valueOf(i));
        }
        for(int i=1;i<120;i++){
            stringList.insert(i,String.valueOf(i));
        }
        System.out.println(stringList);
    }

    @Test
    public void locate() {
        System.out.println(stringList.locate(stringList.get(1)));
        System.out.println(stringList.locate(stringList.get(2)));
        System.out.println(stringList.locate(stringList.get(stringList.length())));
        System.out.println(stringList.locate("123"));
    }
}
