import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int sum=0;
        for (int i=0;i< str.length();i++){
            sum=sum+(int)str.charAt(i);
        }
        System.out.println(sum);
    }
}
