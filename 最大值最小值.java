import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    DecimalFormat df=new DecimalFormat("#.00");
       float v1 = 0.0f;
       float minval = Float.MAX_VALUE;
       float maxval = Float.MIN_VALUE;
       for (int i=0;i<10;i++){
           v1 = scn.nextFloat();
           if (v1<minval){
               minval=v1;
           }
           if (v1>maxval){
               maxval=v1;
           }
        }
        System.out.println(df.format(maxval));
        System.out.println(df.format(minval));
    }
}
