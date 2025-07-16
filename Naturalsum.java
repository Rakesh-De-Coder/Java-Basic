import java.util.*;
public class Naturalsum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many tomes do you want to print hello world:");
        int num = sc.nextInt();
        int counter = 0;
        int times = 0;
        while (counter<num){
            System.out.println("hello World");
            counter++;
            times++;

        }  System.out.print(times + ":times printed");       
    }    
      
}      