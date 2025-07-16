import java.util.*;
public class ReverseNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print('enter your number to be reversed'\n);
        int num = sc.nextInt();
        int numb = num;
        int rev = 0;
        while(num>0){
            int lsd = num%10;
            rev = rev*10 +lsd;
            num/=10;
        }System.out.print("reverse of "+ numb +"is "+rev);

    }

    
}
