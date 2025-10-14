package collectionFramework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringComparator implements Comparator<String>{
    
    @Override
    public int compare(String arg0, String arg1) {
        // TODO Auto-generated method stub
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> list0 = Arrays.asList("Mango", "Banana", "date");
        list0.sort(new StringComparator());
        System.out.println(list0);
    }
}
