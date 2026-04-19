package WurfelJava;
import java.util.Random;
public class Wurfel{
    public static void main(String[] args){
        Random random = new Random();
    int wurfel = random.nextInt(6) + 1;
    int wurfel2 = random.nextInt(6) + 1;
    if(wurfel == wurfel2){
        System.out.println("Du hast eine " + wurfel2 + " und ein " + wurfel + " gewürfelt.");
        System.out.println("Du hast ein Pasch gewürfelt.");
    }else if(wurfel == 6 || wurfel2 == 6){
        System.out.println("Du hast ein patch von zwei Sechsen gewürfelt.");
    }else{
        System.out.println("Du hast eine " + wurfel2 + " und ein " + wurfel + " gewürfelt.");
    }
 }
}