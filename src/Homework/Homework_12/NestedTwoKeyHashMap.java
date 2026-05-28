package Homework.Homework_12;

import java.util.*;

class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {
    //para przechowuje wartość (max 1)
    //domyślnie klucze i wartości null -> NPE
    //równość par na podstawie equals/hashCode

    private final Map<K1, Map<K2, V>> map;

    public NestedTwoKeyHashMap() {
        this.map = new HashMap<>();
    }

    @Override
    public V put(K1 k1, K2 k2, V value) {
        Objects.requireNonNull(k1);
        Objects.requireNonNull(k2);
        Objects.requireNonNull(value);

        return map.computeIfAbsent(k1, key -> new HashMap<>()).put(k2, value);
    }

    @Override
    public V get(K1 k1, K2 k2) {
        Objects.requireNonNull(k1);
        Objects.requireNonNull(k2);

        Map<K2, V> k1Map = map.get(k1);

        if (k1Map == null) return null;
        return k1Map.get(k2);
    }

    @Override
    public V remove(K1 k1, K2 k2) {
        Objects.requireNonNull(k1);
        Objects.requireNonNull(k2);

        Map<K2, V> k1Map = map.get(k1);

        if (k1Map == null) return null;
        V removed = k1Map.remove(k2);

        if (k1Map.isEmpty()) {
            map.remove(k1);
        }

        return removed;
    }

    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        Objects.requireNonNull(k1);
        Objects.requireNonNull(k2);

        Map<K2, V> k1Map = map.get(k1);

        if (k1Map == null) return false;
        return k1Map.containsKey(k2);
    }

    @Override
    public boolean containsValue(V value) {
        Objects.requireNonNull(value);

        for (Map<K2, V> k1Map : map.values()) {
            if (k1Map.containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return map.values()
                .stream()
                .mapToInt(Map::size)
                .sum();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        Set<Entry<K1, K2, V>> entrySet = new HashSet<>();

        for (Map.Entry<K1, Map<K2, V>> entry : map.entrySet()) {
            K1 key1 = entry.getKey();
            Map<K2, V> nestedMap = entry.getValue();

            for (Map.Entry<K2, V> nestedEntry : nestedMap.entrySet()) {
                K2 key2 = nestedEntry.getKey();
                V value = nestedEntry.getValue();

                entrySet.add(new NestedEntry(key1, key2, value));
            }
        }

        return entrySet;
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        Set<Pair<K1, K2>> pairsSet = new HashSet<>();

        for (Map.Entry<K1, Map<K2, V>> entry : map.entrySet()) {
            K1 key1 = entry.getKey();
            Map<K2, V> nestedMap = entry.getValue();

            for (Map.Entry<K2, V> nestedEntry : nestedMap.entrySet()) {
                K2 key2 = nestedEntry.getKey();

                pairsSet.add(new Pair<>(key1, key2));
            }
        }

        return pairsSet;
    }

    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();

        for (Map.Entry<K1, Map<K2, V>> entry : map.entrySet()) {
            entry.getValue().forEach((key2, value) -> values.add(value));
        }

        return values;
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {
        Objects.requireNonNull(other);

        for (Entry<? extends K1, ? extends K2, ? extends V> entry : other.entrySet()) {
            map.computeIfAbsent(entry.getKey1(), key -> new HashMap<>()).put(entry.getKey2(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Map<K2, V> row(K1 k1) {
        Objects.requireNonNull(k1);

        return map.get(k1);
    }

    @Override
    public Map<K1, V> column(K2 k2) {
        Objects.requireNonNull(k2);

        Map<K1, V> columnMap = new HashMap<>();

        for (Map.Entry<K1, Map<K2, V>> entry : map.entrySet()) {
            if (entry.getValue().containsKey(k2)) {
                K1 key1 = entry.getKey();
                V value = entry.getValue().get(k2);

                columnMap.put(key1, value);
            }
        }

        return columnMap;
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return entrySet().iterator();
    }

    private class NestedEntry implements Entry<K1, K2, V> {
        private final K1 key1;
        private final K2 key2;
        private V value;

        public NestedEntry(K1 key1, K2 key2, V value) {
            this.key1 = key1;
            this.key2 = key2;
            this.value = value;
        }

        @Override
        public K1 getKey1() {
            return key1;
        }

        @Override
        public K2 getKey2() {
            return key2;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return this.value;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            NestedEntry that = (NestedEntry) o;
            return Objects.equals(key1, that.key1) && Objects.equals(key2, that.key2) && Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key1, key2, value);
        }
    }
}
