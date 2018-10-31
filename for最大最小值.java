import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
      float v1 = 0.0f;
      float maxval = Float.MIN_VALUE;
      float minval = Float.MAX_VALUE;
      for (int i=0;i<n;i++){
          v1 = scn.nextFloat();
          maxval = Math.max(maxval,v1);                                //if (v1>maxval){
          minval = Math.min(minval,v1);                                //  maxval=v1;
          }
        System.out.println(maxval);
        System.out.println(minval);                                 //if (v1<minval){
                                                                  //  minval=v1;
          }
      }