package study.demo01;
/*
两种常见的数组初始化方法：
1. 动态初始化（指定长度）
数据类型[] 数组名称 = new 数据类型[数组长度];
2. 静态初始化（指定内容）
数据类型[] 数组名称 = new 数据类型[] {元素1,元素2,...};
省略格式：
数据类型[] 数组名称 = {元素1,元素2,...};
*/
public class Demo01Array {
    public static void main(String[] args) {
        int[] score = new int[10];
        score[0] = 100;

    }
}
