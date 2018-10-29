import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        switch (str){
            case "Spring":
                System.out.println("2~4月");
                break;
            case "Summer":
                System.out.println("5~7月");
                break;
            case "Fall":
                System.out.println("8~10月");
                break;
            case "Winter":
                System.out.println("11~1月");
                break;


        }


        }
    }



















      //  String st = scn.next();
       // int v1 = Integer.parseInt(st,16);
        //System.out.println((char)v1);

