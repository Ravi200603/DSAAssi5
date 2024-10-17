public interface ListADT<T> extends Iterable<T>{

    public T removeFirst();

    public T removeLast();

    public T remove(T element);

    public T first();

    public T last();

    public boolean contains();

    public boolean isEmpty();

    public int size();

    public Iterable<T> Iterator();

    public String toString();




}