import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First number");
        int num = sc.nextInt();
        System.out.print(" enter your operator");
        char operator = sc.next().charAt(0);
        System.out.print("enter uour second number");
        int num2 = sc.nextInt();
        switch(operator){
            case '+': System.out.println(num+num2);
                     break;
            
            case '-': System.out.println(num-num2);
                      break;
            case '*': System.out.println(num*num2);
                     break;
            case '/': System.out.println(num/num2);
                      break;
            default:System.out.println("you have not entered correct operator:");
        }
    }
}
