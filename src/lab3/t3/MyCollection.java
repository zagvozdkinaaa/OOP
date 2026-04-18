package lab3.t3;
import java.util.Iterator;

public interface MyCollection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean add(E e);
    boolean remove(Object o);
    void clear();
    boolean contains(Object o);
    @Override
    Iterator<E> iterator();
}
