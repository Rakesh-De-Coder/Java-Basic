//to cheeck weather gieven no is even or not 
import java.util.*;
public class TernaryOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number to cheeck: ");
        int num = sc.nextInt();
        String con = (num %2 == 0)? "even number":"odd number";
        System.out.print(con);


    }

}