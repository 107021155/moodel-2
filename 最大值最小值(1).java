import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
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
        System.out.printf("%.2f\n",maxval);
        System.out.printf("%.2f",minval);
    }
}
