package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        User u1 = new User("id001", "zhangsan", "qawsed");
        User u2 = new User("id002", "zhanghe", "qawsed123");
        User u3 = new User("id003", "zhangge", "qawsed321");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        int id1 = getIndex("id001", list);
        int id2 = getIndex("id006", list);
        System.out.println(id1);
        System.out.println(id2);
    }

    public static int getIndex(String id, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String userId = user.getId();
            if (id.equals(userId)) {
                return i;
            }
        }
        return -1;
    }
}
