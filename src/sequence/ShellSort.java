package sequence;

import java.util.Arrays;

/**
 * 说明：https://www.cnblogs.com/chengxiao/p/6104371.html
 * https://www.cnblogs.com/onepixel/articles/7674659.html#!comments
 * 希尔排序
 * 工作原理：
 * 时间复杂度
 * 平均时间复杂度
 * 空间复杂度
 * 稳定性：
 */
public class ShellSort {
    public static void main(String[] args) {
        int count = 0;
        int[] arry = new int[]{19, 90, 55, 26, 35, 56, 44, 17, 26};
    }

    /**
     * 希尔排序中的用的插入排序
     * @param arry
     * @return
     */
    public int[] insertSort(int[] arry) {
        for (int i = 1; i < arry.length; i++) {
            int preIndex = i - 1;
            int temp = arry[i]; // 当前的目标值
            while (preIndex >= 0 && arry[preIndex] >= temp) {
                arry[preIndex + 1] = arry[preIndex];
                preIndex--;
            }
            // 如果不满足条件了，所以可以用preIndex + 1来获取到顺序的位置
            arry[preIndex + 1] = temp;
        }
        return arry;
    }
}
