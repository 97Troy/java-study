package arraylist;

import java.util.ArrayList;

public class ArrayLIstDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println(array);


//        System.out.println(array.remove("world"));
//        System.out.println(array.remove("javaee"));
        String s = " ";
        System.out.println(array.set(1,"World!"));
        System.out.println(array);
        System.out.println(array.get(0));
        System.out.println(array.size());
        System.out.println(s + array);

    }
}
