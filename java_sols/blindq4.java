package java_sols;
import java.util.*;
public class blindq4 {
    public int[] productExceptSelf(int[] nums){//solution with proper intuition


        int prod_val=1;
        int prefix[]=new int[nums.length];
        int postfix[]=new int[nums.length];
        int output[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            prod_val*=nums[i];
            prefix[i]=prod_val;
        }
        prod_val=1;
        for(int i=nums.length-1;i>=0;i--){
            prod_val*=nums[i];
            postfix[i]=prod_val;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                output[i]=postfix[i+1];
            }
            else if(i==nums.length-1){
                output[i]=prefix[i-1];
            }
            else{
                output[i]=prefix[i-1]*postfix[i+1];
            }
        }
        return output;
    }

    public int[] productExceptSelf_optimizes(int[] nums){ //A more memory optimized solution that uses lesser memory.

        int output[]=new int[nums.length];
        int prefix=1;
        for(int i=0;i<nums.length;i++){
            output[i]=prefix;
            prefix*=nums[i];
        }
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){
            output[i]*=postfix;
            postfix*=nums[i];
        }

        return output;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        blindq4 ob=new blindq4();

        System.out.println("Enter Array length");
        int n=sc.nextInt();
        System.out.println("enter Array elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Product of array except self is:");
        for(int i=0;i<n;i++){
            System.out.print(ob.productExceptSelf_optimizes(a)[i]+" ");
        }
    }
}
