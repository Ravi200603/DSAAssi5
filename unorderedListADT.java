public interface unorderedListADT<T> extends ListADT<T> {
    
    public void addtoFront(T element);

    public void addtoLast(T element);

    public void addAfter(T element, T target);

}
