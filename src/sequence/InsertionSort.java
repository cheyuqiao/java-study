package sequence;

import java.util.Arrays;

/**
 * 插入排序
 * 工作原理：1.从第一个元素开始，该元素可以认为已经被排序；
 *          2.取出下一个元素，在已经排序的元素序列中从后向前扫描；
 *          3.如果该元素（已排序）大于新元素，将该元素移到下一位置；
 *          4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 *          5.将新元素插入到该位置后；
 *          重复步骤2~5。
 * 时间复杂度 n - n^2
 * 平均时间复杂度 n^2
 * 空间复杂度 1
 * 稳定性：稳定
 */
public class InsertionSort {
    public static void main(String[] args) {
        int count = 0;
        int[] arry = new int[]{19, 90, 55, 26, 35, 56, 44, 17, 26};
        for (int i = 1; i < arry.length; i++) {
            int preIndex = i - 1;
//            int index = i;  // 当前坐标
            int temp = arry[i]; // 当前的目标值
            while (preIndex >= 0 && arry[preIndex] >= temp) {
                System.out.println("后挪一次");
                count++;
                arry[preIndex + 1] = arry[preIndex];
//                index--;
                preIndex--;
            }
            // 如果不满足条件了，所以可以用preIndex + 1来获取到顺序的位置
            arry[preIndex + 1] = temp;
            System.out.println("第" + i + "遍后：" + Arrays.toString(arry));
        }
        System.out.println("结果：" + Arrays.toString(arry));
        System.out.println("总共比较：" + count + "次");
    }
}
