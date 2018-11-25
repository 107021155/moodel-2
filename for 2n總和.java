import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=(Math.pow(2,i));
        }
        System.out.println(sum);
    }
}















      //  String st = scn.next();
       // int v1 = Integer.parseInt(st,16);
        //System.out.println((char)v1);

