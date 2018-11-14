import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int sum=0,n = scn.nextInt();
        for (int j=0;j<n;j++) {
            for (int i = 0; i < str.length(); i++) {
                sum = sum + (int) str.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
