class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        s = 0
        res = 2**31 - 1
        
        for k in range(l,r+1):
            s = 0
            for i in range(len(nums)):
                if(i>k-1):
                    s-=nums[i-k]
                
                s+=nums[i]
                if(s>0 and i>k-2):
                    res = min(res, s)
                print(s)

        if(res == 2**31 - 1):
            return -1
        return res


        

        