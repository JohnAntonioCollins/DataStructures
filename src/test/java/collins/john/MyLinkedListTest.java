package collins.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by johncollins on 2/24/17.
 */
public class MyLinkedListTest
{
    MyLinkedList testList;
    String item;

    @Before
    public void setUp()
    {
        testList = new MyLinkedList();
        item = "item";
    }

    @Test
    public void myAdd_FIRST_ITEM_Test()
    {
        testList.myAdd(item);
        String actual = (String) testList.head.element;
        String expected = "item";
        assertEquals("should say 'item'", expected, actual);
    }

    @Test
    public void myAdd_SECOND_ITEM_Test()
    {
        testList.myAdd(item);
        testList.myAdd("item2");
        String actual = (String) testList.head.element;
        String expected = "item2";

    }

    @Test
    public void myAdd_SEVERAL_ITEMS_Test()
    {
        for (int i = 0; i < 10; i++)
        {
            testList.myAdd(i);
        }
        int actual = (int) testList.head.element;
        int expected = 9;
        assertEquals("should return 9, last created Node's element", expected, actual);
    }

    @Test
    public void getNextTest()
    {
        for (int i = 0; i < 10; i++)
        {
            testList.myAdd(i * 5);
        }

        int actual = (int) testList.head.getNext().getNext().element;
        int expected = 35 ;
        assertEquals("should say 5, value assigned to first element", expected, actual);
    }
/*
    @Test
    public void myAdd_ITERATION_Test()
    {
        for (int i = 0; i < 10; i++)
        {
            testList.myAdd(i);
        }
        MyLinkedList.MyNode temp = testList.startOfList.getNext();
       int actual = (int) temp.getNext().element;

        //int actual = (int) testList.endOfList.element;
        int expected = -1;
        assertEquals("should return 9, last created Node's element", expected, actual);
    }
*/

}
