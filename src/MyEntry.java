import java.util.Objects;

public class MyEntry<K, V> {
    K key;
    V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "key = " + key + " | value = " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
        return Objects.equals(key, myEntry.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
