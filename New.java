import java.util.*;
public class New{
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum =0;
        for(int i=0;i<nums.size();i++){
            int count =0;
            while(i>0){
                if((i&1)!=0){
                    count ++;
                }
                i=i>>1;
            }
            if(count==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }

    
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int result = sumIndicesWithKSetBits(list,1);
        System.out.println(result);
    }
    
}
