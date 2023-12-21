class Solution:
    def maxProfit(self, prices: [int]) -> int:
        
        if not prices:
            return 0
        
        minimum=prices[0]
        profit=0
        for i,j in enumerate(prices):
            if j<=minimum and i!=len(prices)-1:
                minimum=j
            else:
                profit=max(profit,j-minimum)
        return profit
    
def main():
    m=Solution()
    print(m.maxProfit([7,6,4,3,1]))

if __name__=="__main__":
    main()
