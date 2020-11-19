package sequence;

import java.util.Arrays;

/**
 * 插入排序
 * 工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 *          然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *          以此类推，直到所有元素均排序完毕。
 * 时间复杂度 n^2 （每次都是n^2）
 * 平均时间复杂度 n^2
 * 空间复杂度 1
 * 稳定性：不稳定
 */
public class SelectionSort {
    public static void main(String[] args) {
        int count = 0;
        int[] arry = new int[]{19, 90, 55, 26, 35, 56, 44, 17, 26};
        for (int i = 0; i < arry.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arry.length; j++) {
                count++;
                if (arry[minIndex] > arry[j]) {
                    minIndex = j;
                }
            }
            int temp = arry[i];
            arry[i] = arry[minIndex];
            arry[minIndex] = temp;
            System.out.println("第" + (i + 1) + "遍后：" + Arrays.toString(arry));
        }
        System.out.println("结果：" + Arrays.toString(arry));
        System.out.println("总共比较：" + count + "次");
    }
}
