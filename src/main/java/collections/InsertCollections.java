package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class InsertCollections {
    Collection insertSet() {
        Collection mySet = new HashSet();
        mySet.add("Andrey");
        mySet.add("Grisha");
        return mySet;
    }

    Map insertMap() {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("key1", 18);
        myMap.put("key2", 100);
        myMap.put("key2", 101);
        return myMap;
    }
}
