public class orderedListDriver {
    public static void main(String[] args) {
     
        oderedList<Integer> list = new oderedList<>(5); // Start with small capacity to test expandCapacity

     
        System.out.println("Is the list empty? " + list.isEmpty());

    
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);

    
        System.out.println("List after adding elements: " + list.toString());

     
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());

     
        System.out.println("Removed first element: " + list.removeFirst());
        System.out.println("List after removing the first element: " + list.toString());

  
        System.out.println("Removed last element: " + list.removeLast());
        System.out.println("List after removing the last element: " + list.toString());

        // Check the size of the list
        System.out.println("Size of the list: " + list.size());

    
        list.add(25);
        list.add(30);
        list.add(35);

 
        System.out.println("List before capacity expansion: " + list.toString());
        System.out.println("Current size: " + list.size());

        
        list.add(40);
        list.add(45);

        
        System.out.println("List after capacity expansion: " + list.toString());
        System.out.println("Current size after expanding: " + list.size());

        
        System.out.println("Final list: " + list.toString());
    }
}
