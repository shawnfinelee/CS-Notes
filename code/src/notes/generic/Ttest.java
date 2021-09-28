package notes.generic;

import java.util.ArrayList;

public class Ttest {
    public static void main(String[] args) {
        Generic g = new Generic(123);
        showKeyV(g);
    }

    public static void showKeyV(Generic<?> generic) {
        System.out.println(generic.getT());
    }

    public static <T> T showKeyName(Generic<T> container){
        System.out.println("container key :" + container.getT());
        //当然这个例子举的不太合适，只是为了说明泛型方法的特性。
        T test = container.getT();
        return test;
    }
}
