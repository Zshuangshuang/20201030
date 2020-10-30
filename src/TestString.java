import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-30
 * Time:18:22
 **/
public class TestString {
    public static String fun(String str){
        String ret = "";
        String[] s = str.split(" ");
        for (String ss: s) {
            ret += ss;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ret = fun(str);
        System.out.println(ret);
    }

    public static void main5(String[] args) {
        String str = "Java#30-split#bit";
        String[] result = str.split("-");
        for (String s:result ) {
                String[] ss = s.split("#");
            for (String sss: ss) {
                System.out.println(sss);
            }
        }
    }

    public static void main4(String[] args) {
        String str = "192.168.0.1";
        String[] stringS = str.split("\\.");
        for (int i = 0; i < stringS.length; i++) {
            System.out.print(stringS[i]+"  ");
        }
    }

    public static boolean isAllNum(String s){
        for (int i = 0; i < s.length(); i++) {
            int ret = s.charAt(i);
            if (ret < '0' || ret > '9'){
                return false;
            }
        }
        return true;
    }

    public static void main3(String[] args) {

        String str = "abcd";
        System.out.println(str.contains("cd"));

    }

    public static void main2(String[] args) {
       char[] val = {'a','b','c','d'};
       String str1 = new String(val);
        System.out.println(str1);

        String str2 = new String(val,1,2);
        System.out.println(str2);

    }
    public static void main1(String[] args) {
        //凡是" "引起来的字符均在字符串常量池中存放
        String str1 = "abc";

        String str2 = new String("abc");
        char[] value = {'a','b','c'};
        String str3 = new String(value);
    }
}
