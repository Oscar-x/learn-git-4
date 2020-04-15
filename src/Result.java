import java.util.Scanner;
public class Result {
    /**
     * 传入的是一个字符串 类似“1+1” “10+12”
     * 判断符号，然后调用对应方法，返回答案
     * 提示：
     * 获取数字可以用：split("\\D")
     * 获取符号可以用: split("\\d+")
     *
     * @return
     */
    public static int result(string x) {
        String count = "114+514";
        String[] num = count.split("\\D");
        String[] symbol=count.split("\\d+");
        String sym=symbol[1];      
        System.out.printf("%s\n",sym);
        int a=Integer.valueOf(num[0]).intValue();
        int b=Integer.valueOf(num[1]).intValue();
        if(sym=="+"){
            Add.add(a,b);
        }
        else if(sym=="-"){
            Subtract.subtract(a,b);
        }
        else if(sym=="*"){
            Multiply.multiply(a, b);
        }
        else if(sym=="/"){
            Divide.divide(a,b);
        }
        else{
            return null;
        }
}
