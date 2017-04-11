package collection;

import java.util.ArrayList;

/**
 * Created by 任纹乾 on
 * 2017/4/10.
 */
public class VectorTest2 {
    public static void main(String[] args) {
        //创建一个集合容器。使用Collection接收子类。ArrayList
        ArrayList list = new ArrayList();
        //添加元素
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        System.out.println(list);//[java1, java2, java3, java4]
        System.out.println(list.remove("java2"));//remove移除被选元素，包括所有文本和子节点。
        System.out.println(list.size());//size判断集合中元素的个数
        list.clear();//clear用来清除数组中，或者列表中的数据的
        System.out.println(list);

    }
}
