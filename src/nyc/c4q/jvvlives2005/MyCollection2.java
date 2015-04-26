package nyc.c4q.jvvlives2005;
import java.util.Iterator;

/**
 * Created by c4q-joshelynvivas on 4/26/15.
 */
public class MyCollection2 <E> extends java.util.AbstractCollection<E>
{
    Object[] myArray2 = new Object[0];
    @Override
    public Iterator<E> iterator()
    {
        return null;
    }

    @Override
    public int size()
    {
        return myArray2.length;
    }
}
