package collection;

/**
 * Created by 任纹乾 on
 * 2017/3/31.
 */
public class ArrayVector {
    private static  final int DEFAULT_CAPACITY = 10;
    private String[]  strings;
    private int capacity;
    private int size;
    public ArrayVector(){
        strings = new String[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }
    public ArrayVector(int initialCapacity){
        strings = new String[initialCapacity];
        capacity = initialCapacity;
    }
    public void add(String string) {
        if (size == capacity) {
            String[] newStrings = new String[capacity * 2];
            capacity *= 2;
            System.arraycopy(strings, 0, newStrings, 0, strings.length);
            strings = newStrings;
        }
        strings[size] = string;
        size++;
    }

    public String get(int index) {
        if (index >= size) { // Exception
            System.out.println("error.");
            System.exit(0);
        }
        return strings[index];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public static void main(String[] args) {
        // String remove(int index)
        // String set(int index, String element)
        ArrayVector arrayVector = new ArrayVector(2);
        arrayVector.add("hello");
        arrayVector.add("hi");
        System.out.println(arrayVector.size());
        System.out.println(arrayVector.capacity());
    }
}
