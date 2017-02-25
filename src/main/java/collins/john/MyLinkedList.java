package collins.john;

import java.util.LinkedList;

/**
 * Created by johncollins on 2/24/17.
 */
public class MyLinkedList<T>
{
    //MyNode node;
    MyNode head;


    public void myAdd(T element)
    {

        if (head == null)
        {
            head = new MyNode(element);

        } else
        {
            MyNode newNode = new MyNode(element);
            newNode.next = head;
            head = newNode;
        }

    }


    /*
    - add -- add an element to the list
	TODO - remove -- remove an element (specified by numeric index) from the list
	- contains -- returns true if the element is in the list, false otherwise
	- find -- returns the element's index if it is in the list, -1 otherwise
        - size -- returns the current size of the list
	- get -- returns the element at the specified index
	- copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
	- sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
	*/
//////////MyNode///////////
    class MyNode<T>
    {
        T element;
        boolean hasNext = false;
        MyNode next;
        int index;

        private MyNode(T element)
        {
            this.element = element;
            //this.previous = endOfList;

        }

        public MyNode getNext()
        {
            return next;
        }
    }
     LinkedList<Integer> fakeList = new LinkedList<>();
    fakeList.
}
