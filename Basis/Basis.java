package Basis;
import java.util.Scanner;
public class Basis{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 24;
        double GeldInKonto = 1000.50;
        // oder float GeldInKonto = 1000.50f;
         boolean Geldreicht = true;
        System.out.println("Du hast " + GeldInKonto +  " in Dein Konto");
        if(Geldreicht){
            System.out.println("Du kannst dir ein neues Auto kaufen");
        }else{
            System.out.println("Du kannst dir kein neues Auto kaufen");
        }
        String x = "Hello";
        String y = " World";
        String temp = null;
        temp = x; 
        x = y; 
        y = temp;
        System.out.println("x value : " + x);
        System.out.println("y value : " + y);
        System.out.println("temp value : " + temp );
        String a = "A";
        String b = "B";
        a = b;
        b = a;
        // System.out.println("A value : " + a);
        // System.out.println("B value : " + b);
        // System.out.println("Gib dein name ein: ");
        // String name = scanner.nextLine();
        // System.out.println("Hallo " + name + " schön dich kennenzulernen.");
        // System.out.println("Gib dein alter ein: ");
        // int alter = scanner.nextInt();
        // scanner.nextLine(); 
        // System.out.println("Du bist " + alter + " Jahre alt.");
        // System.out.println("Gib dein favorites Essen ein: ");
        // String essen = scanner.nextLine();
        // System.out.println("Dein favorites Essen ist " + essen);
        scanner.close();
       int freinds = 10;
       freinds = freinds + 1;
         System.out.println("Du hast " + freinds + " Freunde");
         myMethod(10);
    }
    public static void myMethod(int hight){
        for(int i = 0; i < hight; i++){
            int value = i + 1;
            int summ = value + i;
            System.out.println("the summ from : " + i + " + " + value + " = " + summ);
        }
    }
}