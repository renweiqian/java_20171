package collection;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 * Created by 任纹乾 on
 * 2017/4/12.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        ListIterator<String> listIterator = strings.listIterator();
        // next
        listIterator.next();
        // prev
        listIterator.previous();
        // index
        // add
        // set
        // remove
    }

}
