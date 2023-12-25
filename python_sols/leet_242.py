class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        letter_set={}

        if len(s)!=len(t):
            return False

        for i in s:
            if i in letter_set.keys():
                letter_set[i]+=1
            else:
                letter_set[i]=1

        for j in t:
            if j in letter_set.keys():
                letter_set[j]-=1
            else:
                return False

        for i in letter_set.values():
            if i!=0:
                return False
            else:
                return True

        pass

def main():
    s = Solution()
    print(s.isAnagram("anagram","nagaram"))
    print(s.isAnagram("aacc","ccac"))

if __name__=="__main__":
    main()