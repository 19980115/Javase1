package demo3;
import java.util.Scanner;
public class BiJiao {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        bJ(a,b);
    }

    public static void bJ(int a,int b){
if (a>b){
    System.out.println("第一个同学的年龄大");
}else {
    System.out.println("第二个同学的年龄大");
}

    }


}
