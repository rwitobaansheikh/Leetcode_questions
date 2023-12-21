class Solution:
    def productExceptSelf(self, nums: [int]):

        output = [1]* len(nums)
        prefix=1
        for i in range(len(nums)):
            output[i]=prefix
            prefix*=nums[i]

        postfix=1
        for i in reversed(range(len(nums))):
            output[i]*=postfix
            postfix*=nums[i]

        return output
    
def main():
        s=Solution()
        print(s.productExceptSelf([1,2,3,4]))
        print(s.productExceptSelf([-1,1,0,-3,3]))

if __name__=="__main__":
        main()
