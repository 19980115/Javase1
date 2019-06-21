package demo5;

public class WanWan {
    public static void main(String[]args){
     int[][]a=new int[3][6];
     for (int i=0;i<3;i++){
         for (int j=0;j<6;j++){
            a[i][j]=0;
         }
     }
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 6; j++) {
               System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
