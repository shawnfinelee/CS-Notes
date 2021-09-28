package notes.container;

import com.sun.webkit.dom.HTMLOptionsCollectionImpl;

import java.util.*;

public class Tester {

    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<Integer>();
//        set.add(1);
//        set.add(3);
//        set.add(2);
//        set.add(4);
//        set.add(5);

        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("cd");
        for(String item : list) {
            System.out.println(item);
        }

        Collections.synchronizedList(list);
    }
}
