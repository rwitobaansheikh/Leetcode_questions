package java_sols;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class blindq3 {
    public boolean containsDuplicate(int[] nums) {
        
        //Map<Integer, Integer> hash=new HashMap<Integer, Integer>();
        Set<Integer> set = new HashSet<Integer> (); 

        for(int i: nums){
            if(set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        blindq3 ob=new blindq3();
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The statement that this array contains duplicates is "+ob.containsDuplicate(arr));
    }
}
