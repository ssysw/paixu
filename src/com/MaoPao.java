package com;

public class MaoPao {
    /**
     * 冒泡排序
     * 1、冒泡排序（Bubble Sort，台湾译为：泡沫排序或气泡排序）是一种简单的排序算法。
     * 它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
     * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
     * 这个算法的名字由来是因为越大的元素会经由交换慢慢“浮”到数列的顶端，故名。
     * <p>
     * 2、算法描述
     * i从0开始，i与i+1比较，如果i>i+1，那么就互换
     * i不断增加，直到i<n-1（n是数组元素的个数，n-1是数组已经最后一个元素） ，一趟下来，
     * 可以让数组元素中最大值排在数组的最后面
     */

    public static void maoPao(int[] arr) {
        int temp = 0;//存储临时变量
        for (int i = 0; i < arr.length - 1; i++) {
            //一次遍历是否发生交换
            boolean flag = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            show(arr);

            //若一次遍历未发生交换，则认为顺序已经排好
            if (flag) {
                break;
            }
        }
    }

    public static void show(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {10, 9, 8, 7, 6, 5};
        maoPao(a);
    }
}
