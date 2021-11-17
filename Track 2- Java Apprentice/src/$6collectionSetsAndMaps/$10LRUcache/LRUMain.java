package $6collectionSetsAndMaps.$10LRUcache;

import java.util.Map;

public class LRUMain {

    public static void main(String[] args) {

        Map<Integer, String> lruCache = new LRUCache();

        lruCache.put(1784, "The Godfather");
        lruCache.put(1202, "Titanic");
        lruCache.put(1503, "Jaws");
        lruCache.put(1501, "Saving Private Ryan");
        lruCache.put(2501, "Back to the Future");

        System.out.println("Added exactly 5 entries");

        for(Map.Entry<Integer, String> entry: lruCache.entrySet()) {
            System.out.println(entry);
        }

        lruCache.put(3000, "The Parasite");
        lruCache.put(4000, "It's a Beautiful Life");

        System.out.println("\nOnly the 5 most recently accessed entries will be preserved");
        for(Map.Entry<Integer, String> entry: lruCache.entrySet()) {
            System.out.println(entry);
        }

        lruCache.get(1503);
        lruCache.get(2501);

        System.out.println("\nAccessed Jaws and Back to the Future");
        for(Map.Entry<Integer, String> entry: lruCache.entrySet()) {
            System.out.println(entry);
        }

    }

}
