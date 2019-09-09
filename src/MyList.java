import java.util.Arrays;

public class MyList<dataType> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa(){
        int newSize = elements.length * 2;
        this.elements = Arrays.copyOf(elements, newSize);
    }

    public void add(dataType element){
        if(size == elements.length) ensureCapa();
        this.elements[size] = element;
        this.size++;
    }

    public dataType get(int i){
        if(i >= this.size || i < 0) throw new IndexOutOfBoundsException("Index : " + i + ", Size = " + i);
        return (dataType) this.elements[i];
    }

}
