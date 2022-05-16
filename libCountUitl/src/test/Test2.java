package test;

public class Test2 {
    public static void main(String[] args) {
        // 冒泡排序
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // 插入排序
        int[] num2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < num2.length; i++) {
            int temp = num2[i];
            int j = i - 1;
            while (j >= 0 && num2[j] > temp) {
                num2[j + 1] = num2[j];
                j--;
            }
        }

        // 排序算法

    }
}
