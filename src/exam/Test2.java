package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num;
        try{
            num = Integer.parseInt(sc.nextLine());
        }catch (Exception e) {
            return;
        }
        if (num < 2 || num > 9) {
            return;
        }
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String stringTmp = sc.nextLine();
            strings.add(stringTmp);
        }
        ArrayList<String> tmp = new ArrayList<>();
        for (int i = 0; i < strings.size() - 1; i++){
            tmp.add(strings.get(i + 1));
        }
        pop(strings.get(0) ,tmp);
    }
    static void pop(String left, ArrayList<String> right) {
        System.out.print(left + " ");
        if (right.size() > 1) {
            ArrayList<String> tmp = new ArrayList<>();
            for (int i = 0; i < right.size() - 1; i++){
                tmp.add(right.get(i + 1));
            }
            pop(right.get(0) ,tmp);
        }
        System.out.println();
    }
}
