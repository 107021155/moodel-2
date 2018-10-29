import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt();
        int result = 0;
        if (a % 2 != 0) {
            a = a + 1;
        }
        for (int i = a; i <= b; i += 2) {
            result = result + i;
        }
        System.out.println(result);
    }
}



















      //  String st = scn.next();
       // int v1 = Integer.parseInt(st,16);
        //System.out.println((char)v1);

