

public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException(String reason){
        super("ElementNotFoundException" + reason);
    }
    
}