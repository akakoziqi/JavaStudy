package study.demo03;

public class Demo01IsSame {

    public static void main(String[] args) {

        System.out.println(isSame(20,20));
        System.out.println(isSame(23,20));
    }

    public static boolean isSame(int a, int b){
        return a == b;
    }
}
