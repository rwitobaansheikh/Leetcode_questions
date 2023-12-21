class Solution1: #Uses 2 forloops, hence complexity is n2. This is not efficient
    def containsDuplicate(self, nums: [int]) -> bool:
        
        for k,p in enumerate(nums): 
            for i,j in enumerate(nums):
                if k==i:
                    continue
                if p==j:
                    return True
        return False
    
class Solution2: #Efficient solution
    def containsDuplicate(self, nums: [int]) -> bool:

        nums_set=set()
        for i in nums:
            if i in nums_set:
                return True
            else:
                nums_set.add(i)
        return False
    
def main():
    s1=Solution1()
    print(s1.containsDuplicate([1,2,3,4]))
    s2=Solution2()
    print(s2.containsDuplicate([1,2,3,4]))

if __name__=="__main__":
    main()