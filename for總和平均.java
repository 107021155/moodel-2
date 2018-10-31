import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int v1=0,sum=0;
        for (int i=0;i<n;i++){
            v1=scn.nextInt();
            sum = sum+v1;
        }
       int a = sum/n;
        System.out.println(sum);
        System.out.println(a);
        }
      }