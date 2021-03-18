package com.zxk.hashMapStudy;

/**
 * @author zxk
 * @version 1.0
 * @description: TODO
 * @date 2021/3/9 8:42
 */
public class HashMap implements MapTest {
    public Entry[] table;
    public int size;

    public HashMap() {
        this.table = new Entry[11];
    }

    @Override
    public void put(Object key, Object value) {
        int hash = key.hashCode();
        int index = hash % table.length;
        if (table[index] == null) {
            table[index] = new Entry(hash, key, value);
            size++;
        } else {
            Entry entry = table[index];
            while (null != entry) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
                entry = entry.next;
            }
            Entry firstEntry = table[index];
            table[index] = new Entry(hash, key, value, firstEntry);
            size++;
        }
    }

    @Override
    public Object get(Object key) {
        int hash = key.hashCode();
        int index = hash % table.length;
        Entry entry = null;
        if (table[index] != null) {
            Entry currentEntry = table[index];
            while (null != currentEntry) {
                if (key.equals(currentEntry.getKey())) {
                    entry = table[index];
                    break;
                }
                currentEntry = currentEntry.next;
            }
        }
        return entry == null ? null : entry.getValue();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < table.length; i++) {
            Entry entry = table[i];
            while (entry != null) {
                stringBuilder.append(entry.getKey() + ":" + entry.getValue() + ",");
                entry = entry.next;
            }
        }
        if (stringBuilder != null) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    class Entry implements MapTest.Entry {
        private Object key;
        private Object value;
        private int hash;
        private Entry next;

        public Entry() {
        }

        public Entry(int hash, Object key, Object value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }

        public Entry(int hash, Object key, Object value, Entry next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public Object getKey() {
            return key;
        }

        @Override
        public Object getValue() {
            return value;
        }
    }
}
