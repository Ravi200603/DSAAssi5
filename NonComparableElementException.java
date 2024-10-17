public class NonComparableElementException extends RuntimeException{
    public NonComparableElementException(String message){
        super("Non Comparable Element" + message);
    }
}