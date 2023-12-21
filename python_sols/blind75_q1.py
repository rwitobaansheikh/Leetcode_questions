class Solution:
    def twoSum(self, nums: [int], target: int):
        hash_map={}
        '''for i,j in enumerate(nums):
            diff=target-j
            if diff in hash_map:
                return [hash_map[diff],i]
            hash_map[j]=i'''
        for i,j in enumerate(nums):
            diff=target-j
            if j in hash_map:
                return [hash_map[j],i]
            #else:
            hash_map[diff]=i

def main():
    s = Solution()
    print(s.twoSum(nums = [2,7,11,15], target = 9))

if __name__=="__main__":
    main()
