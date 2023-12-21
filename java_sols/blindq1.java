package java_sols;

import java.util.*;
public class blindq1 {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++)
            if(map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]),i};
            else
                map.put(target-nums[i],i);
            
        return new int[]{};  
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        blindq1 ob=new blindq1();
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter Target value for given array.");
        int target=sc.nextInt();
        System.out.println("TwoSum Indices of given array are:");
        //int TwoSum[] = ob.twoSum(nums,target); //new int[2];
        for(int i=0;i<ob.twoSum(nums,target).length;i++)
            System.out.print(ob.twoSum(nums,target)[i]+" ");
        //System.out.println(ob.twoSum(nums,target));
    }
}
