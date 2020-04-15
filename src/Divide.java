public class Divide {
    /**
     * 传入两个数，计算除法结果并返回，注意除数为0情况
     *
     * @return
     */
    public static int divide(int x,int y) {
        if(y==0)
        {
            System.out.println("除数不能为0");

        }
        else{
            return x/y;
        }
        return 0;
    }
}
