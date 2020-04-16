import java.util.Scanner;

public class Input {
    /**
     * 显示提示，提醒用户输入
     * 返回获取的用户输入字符串
     *
     * @return
     */
    public static String input() {
        System.out.println("请输入需要计算的整数（如：1+10）:");
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();
        if (!info.isEmpty()){
            if(info.contains("+")) {
                if(infoJudge(info,"\\+")){
                    return info;
                }
            }
            else if(info.contains("-")){
                if(infoJudge(info,"\\-")){
                    return info;
                }
            }
            else if(info.contains("*")){
                if(infoJudge(info,"\\*")){
                    return info;
                }
            }
            else if (info.contains("/")){
                if(infoJudge(info,"\\/")){
                    return info;
                }
            }
            else {
                System.out.println("未输入符号");
                return null;
            }
        }
        System.out.println("未输入");
        return null;
    }
    static boolean infoJudge(String info, String symbol){
        String[] info_split = info.split(symbol);
        if (info_split.length == 2 && (!info_split[0].isEmpty() && !info_split[1].isEmpty())) {
            return true;
        }
        else {
            System.out.println("未输入两位数");
            return false;
        }
    }
}
