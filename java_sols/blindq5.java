package java_sols;

import java.util.Scanner;

public class blindq5 {
    public int maxSubArray(int[] nums) {

        int max_sum=nums[0];
        int current_sum=0;

        for(int i: nums){
            if(current_sum<0)
                current_sum=0;
            current_sum+=i;
            max_sum=Math.max(current_sum,max_sum);
        }

        return max_sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        blindq5 ob=new blindq5();
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The max sum of sub_array is: "+ob.maxSubArray(arr));
    }
}
