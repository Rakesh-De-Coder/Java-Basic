import java.util.*;
public class Array1{
    public static int LinearSearch( int number[], int key){
        for(int i=0 ;i< number.length ; i++){
            if(number[i] ==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={30,40,23,2,6,8,7};
        int key = 20;
        int index =LinearSearch(number,key);
        if (index == -1){
            System.out.println( "keynot found inside  array");
        } 
        else{
            System.out.println(key + " key is found at index  " + index);
        }
    }
    
}
