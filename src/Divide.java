public class Divide {
    /**
     * 传入两个数，计算除法结果并返回，注意除数为0情况
     *
     * @return
     */
    public static int divide(double x,double y) {
        double result;
        result = x/y;
        if(x==0||y==0)
        {
            System.out.println("除数不能为0");

        }
        else{
            System.out.println("结果="+result);
        }
        return 0;
    }
}
