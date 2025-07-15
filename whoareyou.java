import java.util.*;
public class whoareyou {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("  conguralation you are aduel you can  vote can deive car");

        }else if(age<18 &&age>13) {
            System.out.print(" you are  teenager");


        }else{
            System.out.print(" you are a child");
        }       
    }
    

}
