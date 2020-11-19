package sequence;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度 n - n^2
 * 平均时间复杂度 n^2
 * 空间复杂度1 需要一个临时变量来存数据
 * 稳定性：稳定
 */
public class MaoPao {
    public static void main(String[] args) {
        int count = 0;
        int[] arry = new int[]{19, 90, 55, 26, 35, 56, 44, 17, 26};
        // length - 1是因为到最后一个数的时候就已经排序完成
        for (int i = 0; i < arry.length - 1; i++) {
            System.out.println(" i = " + i);
            // j = i + 1是因为用i和i后面比较，避免i和j在同一个位置，每次都多一次
            for (int j = i + 1; j < arry.length; j++) {
                System.out.println(" j = " + j);
                count++;
                if (arry[i] > arry[j]){
                    int temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "遍后：" + Arrays.toString(arry));
        }
        System.out.println("结果：" + Arrays.toString(arry));
        System.out.println("总共比较：" + count + "次");
    }
}
