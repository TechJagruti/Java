import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);
       
        // Set example
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2); // Duplicate ignored
        System.out.println("Set: " + set);
       
        // Map example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("Map: " + map);
       
        // Queue example
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        System.out.println("Queue: " + queue);
    }
}
