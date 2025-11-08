package collectionFramework;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyArrayLIst {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Bread");
        list.add("Eggs");
        list.add("Sauce");
        System.out.println(list);

        for (String item : list) {
            System.out.println(item);
            if (item == "Eggs") {
                list.add("Butter");
            }
        }
        System.out.println(list);

    }
}
