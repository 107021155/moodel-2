import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int a = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt();
       for (int i=a; i<=b; i++){
           if (i%c==0){
               System.out.println(i);
           }
       }
    }
}
