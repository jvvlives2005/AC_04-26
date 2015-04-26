package nyc.c4q.jvvlives2005;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by c4q-joshelynvivas on 4/26/15.
 */
public class MyCollection<E> implements Collection<E>
{
    //T[] list;

    Object[] myArray = new Object[0];

    @Override
    public int size()
    {
        return myArray.length;
    }

    @Override
    public boolean isEmpty()
    {
        if (myArray.length == 0){
            return true;}

            return false;
    }

    @Override
    public boolean contains(Object o){
            for(Object myObject: myArray){
                if(myObject.equals(o)){
                    return true;
                }
            }
        return false;
    }

    @Override
    public Iterator <E> iterator()
    {
        return null;
    }

    @Override
    public Object[] toArray()
    {
        return new Object[0];
    }

    @Override
    public boolean add(E e)
    {
        return false;
    }

    @Override
    public boolean remove(Object o)
    {
        Object[] newArray = new Object[myArray.length - 1];
        int j = 0;
        for (int i = 0; i < myArray.length; ++i){
            if (!myArray[i].equals(o)){
                newArray[i] = myArray[i];
                j++;
            }
        }
        myArray = newArray;
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        return false;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public boolean retainAll(Collection c)
    {
        return false;
    }

    @Override
    public boolean removeAll(Collection c)
    {
        return false;
    }

    @Override
    public boolean containsAll(Collection <?> c)
    {
        return false;
    }

    @Override
    public E[] toArray(Object[] a)
    {
        return (E[]) new Object[0];
    }
}
