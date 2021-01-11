package study.demo04;

/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住不同的方法名称
为了解决这种问题，可以使用方法重载
方法的重载（Overload）：多个方法的名称一样，但是参数列表不一样
好处：只需要记住唯一的一个方法名称，就可以实现多个类似的功能

方法重载与下列因素有关：
1. 参数个数不同
2. 参数类型不同
3. 参数的多类型顺序不同

方法重载与下列因素无关：
1. 与方法的返回值无关
2. 与参数的名称无关

*/
public class Demo01MethodOverload {
    public static void main(String[] args) {

        System.out.println(sum(12,13));
        System.out.println(sum(12,13,15));
        System.out.println(sum(12,13,15,16));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
