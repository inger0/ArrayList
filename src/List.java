public interface List {

    public int indexOf(Object O);

    public int lastIndexOf(Object o);

    public boolean contains(Object o);

    public void add(int index, Object o);

    public void add(Object o);

    public boolean remove(Object o);

    public Object remove(int index);

    public void clear();

    public Object set(int index, Object o);

    public Object get(int index);

    public boolean isEmpty();

    public int size();

    public void printElements();
}
