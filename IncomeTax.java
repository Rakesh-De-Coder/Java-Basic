import java.util.*;
public class IncomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please intear your income");
        int income = sc.nextInt();
        int tax;
        if(income<500000){
            tax = 0;

        
        }else if(income>500000&&income<1000000){
            tax =  (int)(income*0.02);

        }else{
            tax =(int) (income*0.03);

        }System.out.print("your income tax is "+ tax);
    }

    
}
