
/**
 * ArrayUnorderedList represents an array implementation of an unordered list.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class unorderedList<T> extends oderedList<T>
        implements unorderedListADT<T> {

    /**
     * Creates an empty list using the default capacity.
     */
    public unorderedList() {
        super();
    }

    /**
     * Creates an empty list using the specified capacity.
     *
     * @param initialCapacity the initial size of the list
     */
    public unorderedList(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Adds the specified element to the front of this list.
     *
     * @param element the element to be added to the front of the list
     */
    public void addtoFront(T element) {
        if (size() == List.length) {
            expandCapacity();
        }
        for (int i = rear; i > 0; i--) {
            List[i] = List[i - 1];
        }
        List[0] = element;
        rear++;
        modCount++;
}


    /**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the list
     */
    public void addtoLast(T element) {
        if (size() == List.length) {
            expandCapacity();
        }
        List[rear] = element;
        rear++;
        modCount++;
    }

    /**
     * Adds the specified element after the specified target element. Throws an
     * ElementNotFoundException if the target is not found.
     *
     * @param element the element to be added after the target element
     * @param target the target that the element is to be added after
     */
    public void addAfter(T element, T target) {
        if (size() == List.length) {
            expandCapacity();
        }

        int scan = 0;

        // find the insertion point
        while (scan < rear && !target.equals(List[scan])) {
            scan++;
        }

        if (scan == rear) {
            throw new ElementNotFoundException("UnorderedList");
        }

        scan++;

        // shift elements up one
        for (int shift = rear; shift > scan; shift--) {
            List[shift] = List[shift - 1];
        }

        // insert element
        List[scan] = element;
        rear++;
        modCount++;
    }

}
