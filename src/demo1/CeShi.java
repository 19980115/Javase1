package demo1;
import java.util.Scanner;
public class CeShi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        switch(x){
            case 1:
                System.out.println("今天是星期一");
                break;
            default:
                System.out.println("输入错误！");
        }
    }
}