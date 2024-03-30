public interface MyList<T> {
    void add(T element);
    T get(int index);
    void remove(int index);
    boolean contains(T element);
    void clear();
    int size();
    int getIndex(T element);
}
