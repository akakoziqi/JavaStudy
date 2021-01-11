package study.demo02;

 /*
方法相当于若干语句的功能集合
定义方法的完整格式：
修饰符 返回值类型 方法名称(参数类型 参数名称, ...){
    方法体
    return 返回值;

修饰符：现阶段的固定写法：public static
方法名称：小驼峰式命名法


方法的三种调用方式：
1. 单独调用：方法名称(参数);
2. 打印调用：System.out.println(方法名称(参数));
3. 赋值调用：变量名称 = 方法名称(参数);
    }
 */

public class Demo02MethodDefine {

    public static int add(int a, int b) {
        System.out.println("方法执行！");
        return a + b;
    }

    public static void main(String[] args) {

        //单独调用
        add(1,3);

        //打印调用
        System.out.println(add(1,3));

        //赋值调用
        int result = add(2,3);
        System.out.println(result);
    }
}
