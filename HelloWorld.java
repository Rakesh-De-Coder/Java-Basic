import java.util.HashMap;

public class HelloWorld{
    
    
    public static void main(String args[]){
        int nums[] = {3,1,3,4,3};
        int k=6;
        int num=maxOperations(nums,k);
        System.out.println(num);
        
    }
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:nums){
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])&&hm.containsKey(k-nums[i])){
                count++;
                if(hm.get(k-nums[i])==1){
                    hm.remove(k-nums[i]);
                }else{
                    hm.put(k-nums[i],hm.get(k-nums[i])-1);
                }
                if(hm.get(nums[i])==1){
                    hm.remove(nums[i]);
                }
                else{
                    hm.put(nums[i],hm.get(nums[i])-1);
                }
            }


        }
        return count;
        
}