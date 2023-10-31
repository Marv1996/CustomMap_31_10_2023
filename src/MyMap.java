import java.util.*;

public class MyMap<K, V> {
    Set<MyEntry<K, V>> set = new HashSet<>();

    public void put(K key, V value) {
        set.remove(new MyEntry<>(key, value));
        set.add(new MyEntry<>(key, value));
    }

    public V get(K key) {
        for (MyEntry<K, V> next : set) {
            if (next.key == key) {
                return next.value;
            }
        }
        return null;
    }

    public Set<MyEntry<K, V>> entrySet() {
        return set;
    }

    @Override
    public String toString() {
        return set + "";
    }
}
