import java.util.*;
public class SumNatural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  count = 1 ;
        int  sum = 0;
        System.out.print("enter how many natural number do you want to calculate sum : ");
        int num = sc.nextInt();
        while (count <= num){
            sum = sum +count;
            count++;

        }
        System.out.println(sum); 



    }
    
}
