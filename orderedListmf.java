// OrderedList class with Modified Find method
public class orderedListmf<T> extends oderedList<T> {

    
    public orderedListmf() {
        super(); 
    }

   
    public orderedListmf(int capacity) {
        super(capacity);  
    }
    public int find(T target) {
        int result = NOT_FOUND; 
    
        if (!isEmpty()) {
            Comparable<T> comparableTarget = (Comparable<T>) target; // Cast to Comparable
            int scan = 0;
            
            while (result == NOT_FOUND && scan < rear) {
               
                if (comparableTarget.compareTo(List[scan]) == 0) {
                    result = scan; 
                }
                
                else if (comparableTarget.compareTo(List[scan]) < 0) {
                    break; 
                }
                // Otherwise, continue searching
                else {
                    scan++;
                }
            }
        }
        
        return result;
    }
     
}
