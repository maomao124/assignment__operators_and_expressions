import java.util.Scanner;

/**
 * Project name(项目名称)：作业_运算符和表达式
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/27
 * Time(创建时间)： 21:12
 * Version(版本): 1.0
 * Description(描述)：
 * 我会对你编写的代码进行若干次测试：
 * 第一次测试会输入数据：10,4；
 * 需要你的程序输出：
 * 两数相加的结果为:14
 * 两数相减的结果为:6
 * 两数相乘的结果为:40
 * 两数相除的结果为:2
 * 两数取余数的结果为:2
 * <p>
 * 第二次测试会输入数据：3，5；
 * 需要你的程序输出：
 * 两数相加的结果为:8
 * 两数相减的结果为:-2
 * 两数相乘的结果为:15
 * 两数相除的结果为:0
 * 两数取余数的结果为:3
 */

public class test
{
    public static void main(String[] args)
    {
        {
            int a;
            int b;
            Scanner input = new Scanner(System.in);
            System.out.println("请输入第一个整数");
            a = input.nextInt();
            System.out.println("请输入第二个整数");
            b = input.nextInt();
            System.out.println("两数相加的结果为：" + (a + b));
            System.out.println("两数相减的结果为：" + (a - b));
            System.out.println("两数相乘的结果为：" + a * b);
            System.out.println("两数相除的结果为：" + a / b);
            System.out.println("两数取余数的结果为：" + a % b);
        }
        /*
         我会对你编写的代码进行若干次测试：
         第一次测试会输入数据：20,34；
         需要你的程序输出：
         a==b=false
         a!=b=true
         a>b=false
         a<b=true
         b>=a=true
         b<=a=false
         第一次测试会输入数据：-8,-18；
         需要你的程序输出：
         a==b=false
         a!=b=true
         a>b=true
         a<b=false
         b>=a=false
         b<=a=true
         */
        {
            int a;
            int b;
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            b = input.nextInt();
            System.out.println("a==b=" + (a == b));
            System.out.println("a!=b=" + (a != b));
            System.out.println("a>b=" + (a > b));
            System.out.println("a<b=" + (a < b));
            System.out.println("b>=a=" + (b >= a));
            System.out.println("b<=a=" + (b <= a));
        }

        /*
         按照相关要求编写程序后，我会对你的程序进行测试。
         预期输入：true，false，true；
         预期输出：
         false
         false
         true
         true
         预期输入：true,false,false；
         预期输出：
         false
         false
         false
         true
         */
        {
            Scanner sc = new Scanner(System.in);
            boolean a = sc.nextBoolean();
            boolean b = sc.nextBoolean();
            boolean c = sc.nextBoolean();
            System.out.println(a && b && c);
            System.out.println(a && b && c);
            //System.out.println(a||b||c);
            System.out.println(c);
            //System.out.println(a^b^c);
            System.out.println(a || b || c);
        }
        /*
         * 测试输入：2012
         * 预期输出：2012是否为闰年：true
         * 测试输入：2013
         * 预期输出：2013是否为闰年：false
         */
        {
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            boolean result;
            result = (year % 4 == 0) ? true : false;
            System.out.println(year + "年是否为闰年:" + result);
        }
        /*
         我会对你的程序进行若干次测试；

         第一次输入：10，2
         预期输出：
         24
         2
         28

         第二次输入：5，3
         预期输出：
         16
         2
         17
         */
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入：");
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println("输出：");
            System.out.println((m + n) * 2);
            System.out.println((m - n) % 3);
            System.out.println((m - n) / 2 + (m + n) * 2);
        }

        /*
         * 嫦娥
         * 3500
         * 女
         * 45.5
         * 月球广寒宫
         * 否
         *
         * 预期输出：
         * 姓名：嫦娥
         年龄：3500岁
         性别：女
         体重：45.5kg
         地址：月球广寒宫
         婚否：否
         */
        {
            System.out.println("请录入嫦娥个人信息：");
            Scanner input = new Scanner(System.in);
            System.out.println("请输入姓名：");
            String names = input.next();
            System.out.println("请输入年龄：");
            int age=input.nextInt();
            System.out.println("请输入性别：");
            String sex=input.next();
            System.out.println("请输入体重：");
            String h=input.next();
            System.out.println("请输入地址：");
            String address = input.next();
            System.out.println("请输入是否已婚：");
            String s=input.next();
            System.out.println("信息如下：");
            System.out.println("\t姓名："+names);
            System.out.println("\t年龄："+age+"岁");
            System.out.println("\t性别："+sex);
            System.out.println("\t体重："+h+"kg");
            System.out.println("\t地址："+address);
            System.out.println("\t婚否："+s);
        }
    }
}
