package sequence;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        int[] arry = new int[]{19, 90, 55, 26, 35, 56, 44, 17, 26};
        for (int i = 0; i < arry.length; i++) {
            for (int j = i; j < arry.length; j++) {
                if (arry[i] > arry[j]){
                    int temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "遍后：" + Arrays.toString(arry));
        }
        System.out.println("结果：" + Arrays.toString(arry));
    }
}
