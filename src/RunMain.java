import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    /**
     * 将其他方法进行组合，使得程序可以运行
     *
     * @param args
     */
    public static void main(String[] args) {
        String str=null;  
        str=Input.input();
        System.out.printf("%d",Result.result(str));

    }
}
