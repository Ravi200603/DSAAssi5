public class unorderedListDriver {
    public static void main(String[] args) {

        unorderedList<Integer> unorderedList = new unorderedList<>(5); // Start with small capacity to test expandCapacity

    
        System.out.println("Adding elements to the front of the list:");
        unorderedList.addtoFront(10);
        System.out.println("List after adding 10 to the front: " + unorderedList);
        unorderedList.addtoFront(5);
        System.out.println("List after adding 5 to the front: " + unorderedList);


        System.out.println("\nAdding elements to the rear of the list:");
        unorderedList.addtoLast(15);
        System.out.println("List after adding 15 to the rear: " + unorderedList);
        unorderedList.addtoLast(20);
        System.out.println("List after adding 20 to the rear: " + unorderedList);

        
        System.out.println("\nAdding more elements to test capacity expansion:");
        unorderedList.addtoFront(1);
        unorderedList.addtoLast(25);
        System.out.println("List after adding 1 to the front and 25 to the rear: " + unorderedList);
    }
}
