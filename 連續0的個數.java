import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     long sum=1;
     int k=0;
     for (int i=1;i<=n;i++){
         sum=sum*i;
     }
     while (sum%10==0){
         k++;
         sum=sum/10;
     }
        System.out.println(k);
    }
}