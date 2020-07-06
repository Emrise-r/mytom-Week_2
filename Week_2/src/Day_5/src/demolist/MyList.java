package demolist;

//import java.lang.reflect.Array;

import java.util.Arrays;

public class MyList<ARX> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(ARX e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public ARX get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", size " + i);
        }
        return (ARX) elements[i];
    }
}
