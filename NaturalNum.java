import java.util.*;
public class NaturalNum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many natural number do you want to prit:");
        int times = sc.nextInt();
        int count = 1 ;
        while (count<=times){
            System.out.print(count + "    ");
            count++;
        }System.out.println();
        System.out.println("all natural number were printed");
        if(4==8){
            System.out.println("natural");

        }

    }
    
}
