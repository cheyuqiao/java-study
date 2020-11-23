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
public class InsertionSort {
    public static void main(String[] args) {
        int count = 0;
        int[] arry = new int[]{19, 90, 55, 26, 35, 56, 44, 17, 26};
        for (int i = 1; i < arry.length; i++) {
            int preIndex = i - 1;
            int index = i;  // 当前坐标
            int temp = arry[index]; // 当前的目标值
            while (preIndex >= 0 && arry[preIndex] >= temp) {
                System.out.println("后挪一次");
                count++;
                arry[index] = arry[preIndex];
                index--;
                preIndex--;
            }
            arry[index] = temp;
            System.out.println("第" + i + "遍后：" + Arrays.toString(arry));
        }
        System.out.println("结果：" + Arrays.toString(arry));
        System.out.println("总共比较：" + count + "次");
    }
}
