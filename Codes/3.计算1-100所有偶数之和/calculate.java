public class calculate {
    public static void main(String[] args) {
        int result = 0;

        // 根据逻辑编写程序
        for(int i = 1;i<=100;i++){
            if(i%2==0) result+=i;
        }

        // 利用continue语句
        // for(int i = 1;i<=100;i++){
        //     if(i%2==1) continue;F
        //     result+=i;
        // }
        System.out.println(result);
    }
}