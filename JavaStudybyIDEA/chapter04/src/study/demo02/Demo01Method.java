package study.demo02;

public class Demo01Method {

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 20; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //调用方法
        printRectangle();
    }

    //方法定义
    public static void printRectangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
