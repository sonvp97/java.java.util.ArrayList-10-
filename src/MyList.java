import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size = 0 ;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public MyList(int size){
        this.size = size;
    }
    public void add (int index, E element){
        if (index>=0&&index<elements.length){
            elements[index] = element;
            size++;
        }
        else System.out.println("Index Not");
    }
    public E remove(int index){
        Object[] temp = new Object[elements.length + 1];
        for (int i = 0;i<elements.length;i++){
            if(i<index) temp[i] = elements[i];
            if(i>index) temp[i-1] = elements[i];
        }
        return (E) (elements = Arrays.copyOf(temp,elements.length));
    }

    public E clone(){
        Object clone[];
        return (E) (clone = Arrays.copyOf(elements,elements.length/2));
    }

    public boolean contains(Object o){
        for (Object object : elements){
            if (object == o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(Object o){
        for (Object object : elements){
            int i = 0;
            i++;
            if (object == o){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e){
        if (size>=0&&size<elements.length){
            elements[elements.length-1] = e;
            return true;
        }
        return false;
    }
    public E get(int i){
        if (i>=0&& i<elements.length){
            return (E) elements[i];
        }
        return null;
    }
    public void clear(){
        for (int i = 0 ; i<elements.length;i++){
            elements[i] = null;
        }
    }


    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
