package study.demo03;

public class Demo02Sum {

    public static void main(String[] args) {

        System.out.println(sum(100));
    }

    public static int sum(int a) {
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += i;
        }
        return result;
    }
}
