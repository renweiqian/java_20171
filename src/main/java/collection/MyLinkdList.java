package collection;

/**
 * Created by 任纹乾 on
 * 2017/4/11.
 */
public class MyLinkdList {
    public static void main(String[] args) {
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.add("a");
    }

    private boolean add(String element) {

        return  true;
    }
    private class Node{
        String element;
        Node prev;
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;

        }
    }

}
