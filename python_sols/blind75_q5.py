class Solution:
    def maxSubArray(self, nums: [int]):

        max_sub_val=nums[0]
        current_sum=0

        for i in nums:
            if current_sum<0:
                current_sum=0
            current_sum+=i
            max_sub_val=max(max_sub_val,current_sum)

        return max_sub_val

def main():
    s=Solution()
    print("Max sub array sum is ",s.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))

if __name__=="__main__":
    main()