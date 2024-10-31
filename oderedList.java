import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class oderedList<T> implements ListADT<T>, Iterable<T> {
    private final static int DEFAULT_CAPCITY = 100;
    public final static int NOT_FOUND = -1;

    protected int rear;
    protected T[] List;
    public int modCount;

    public oderedList() {
        this(DEFAULT_CAPCITY);

    }

    public oderedList(int Capacity) {
        rear = 0;
        List = (T[]) (new Object[Capacity]);
        modCount = 0;
    }

    public T remove(T element) {
        T result;
        int index = find(element);
        if (index == NOT_FOUND) {
            throw new ElementNotFoundException("ArrayList");
        }
        result = List[index];
        rear--;

        for (int scan = index; scan < rear; scan++) {
            List[scan] = List[scan + 1];

        }
        List[rear] = null;
        modCount++;
        return result;
    }

    public boolean Contains(T element) {
        return find(element) == NOT_FOUND;
    }

    public int find(T Target) {
        int scan = 0;
        int result = NOT_FOUND;
        if (!isEmpty()) {
            while (result == NOT_FOUND && scan < rear) {
                if (Target.equals(List[scan])) {
                    result = scan;

                } else {
                    scan++;
                }

            }
        }
        return result;
    }

    public void add(T element) {
        if (!(element instanceof Comparable)) {
            throw new NonComparableElementException("OrderedList");

        }
        Comparable<T> comparableElement = (Comparable<T>) element;

        if (size() == List.length) {
            expandCapacity();
        }
        int scan = 0;

        while (scan < rear && comparableElement.compareTo(List[scan]) > 0) {
            scan++;
        }
        for (int shift = rear; shift > scan; shift--) {
            List[shift] = List[shift - 1];
        }
        List[scan] = element;
        rear++;
        modCount++;
    }

    public void addAfter(T element, T target) {
        if (size() == List.length) {
            expandCapacity();
        }
        int scan = 0;
        while (scan < rear && !target.equals(List[scan])) {
            scan++;
        }
        for (int shift = rear; shift > scan; shift++) {
            List[shift] = List[shift - 1];
        }
        List[scan] = element;
        rear++;
        modCount++;
    }

    public void expandCapacity() {
        List = Arrays.copyOf(List, List.length * 2);
    }

    public T removeLast() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayList is Empty");
        }
        T result = List[rear - 1];
        List[rear - 1] = null;
        rear--;
        modCount++;
        return result;

    }

    public T removeFirst() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayList is Empty");
        }
        T result = List[0];
        for (int scan = 0; scan < rear; scan++) {
            List[scan] = List[scan + 1];

        }
        List[rear - 1] = null;
        rear--;
        modCount++;
        return result;
    }

    public T first() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Array is Empty");
        }
        return List[0];
    }

    public T last() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Array is Empty");
        }
        return List[rear - 1];
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public int size() {
        return rear;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < rear; i++) {
            result += List[i];
            if (i < rear - 1) {
                result += ",";
            }
        }
        result += "]";
        return result;

    }

   
   

   
    @Override
    public boolean contains() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator<T> iterator() {
        return new orderedListIterator();
    }
    public class orderedListIterator<T> implements Iterator<T> {
        
        int current;
        int iterableModCount;

        public orderedListIterator() {
            current = 0;
            iterableModCount = modCount;
        }
        

        @Override
        public boolean hasNext() throws ConcurrentModificationException {
            if (modCount != iterableModCount) {
                throw new ConcurrentModificationException();
            }
            return current < rear;
        }

        @Override
        public T next() throws ConcurrentModificationException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            current++;

            return (T) List[current - 1];
        }

        public void remove() throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

    }
    @Override
    public Iterable<T> Iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Iterator'");
    }
   
}

