public class orderedListmfdriver {
    public static void main(String[] args) {

        orderedListmf<Integer> orderedList = new orderedListmf<>();
        
   
        orderedList.add(10);
        orderedList.add(20);
        orderedList.add(30);
        orderedList.add(40);
        orderedList.add(50);
        

        System.out.println("Find 20: " + orderedList.find(20)); // Should return index 1
        System.out.println("Find 50: " + orderedList.find(50)); // Should return index 4
        System.out.println("Find 10: " + orderedList.find(10)); // Should return index 0


        System.out.println("Find 25 (not in list): " + orderedList.find(25)); 
        System.out.println("Find 5 (smaller than first element): " + orderedList.find(5)); 
        System.out.println("Find 60 (larger than largest element): " + orderedList.find(60)); 
    }
}
