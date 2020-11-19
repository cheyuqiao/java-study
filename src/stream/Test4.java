package stream;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer integer = new Integer(i);
            list.add(integer);
        }
        list.forEach(num -> {
            if (num.intValue() == 5) {
                return;
            }
            System.out.println("----" + num);
        });
    }
}
