package $7genericCreatingClassesAndMethod.$8parameterizingclasses;

import java.util.Map;

public class MapHelper<K, V> {

    public void addEntries(Map<K, V> map, K[] keys, V[] values) {
        int index = 0;
        for(K key: keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public void printEntries(Map<K, V> map) {
        System.out.println("\n**********Map entries");
        for(Map.Entry<K, V> entry: map.entrySet()) {
            System.out.println(entry);
        }
    }

}
