public class Driver {
    public static void main(String[] args) {
 
        unorderedList<Integer> list = new unorderedList<>();

      
        System.out.println("Adding elements to the rear of the list:");
        list.addtoLast(10);
        list.addtoLast(20);
        list.addtoLast(30);
        System.out.println("List contents: " + list);

        
        System.out.println("Adding an element to the front of the list:");
        list.addtoFront(5);
        System.out.println("List contents: " + list);

        
        System.out.println("Adding an element after a specified target:");
        try {
            list.addAfter(25, 20);
            System.out.println("List contents: " + list);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
