import java.util.Collection;

/**
 * Created by User on 04.06.2016.
 */
public interface MyList<E> extends Iterable  {
    void add(E element);

    E get(int index);

    E set(int index, E element);

    int remove(E element);

    void addAll(Collection<? extends E> source);

    int size();

    boolean contains(E element);

    boolean isEmpty();

}
