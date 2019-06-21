package demo2;

public class DayHa {
    public static void main(String[]args) {

       b: for(int i=0;i<3;i++){
            for(int j=0;j<5;j++) {
                System.out.print("*");
                if (i == 1) {
                    break b;
                }
            }
System.out.println();
        }
    }
}

