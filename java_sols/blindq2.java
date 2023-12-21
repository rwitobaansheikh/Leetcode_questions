package java_sols;

import java.util.Scanner;

class blindq2 {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minimum=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minimum && i!=prices.length-1)
                minimum=prices[i];
            profit=Math.max(profit,prices[i]-minimum);
        }
        
        return profit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        blindq2 ob=new blindq2();
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println("Best profit from buying stocks="+ob.maxProfit(prices));
    }

}