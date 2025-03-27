class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        n=0
        while(k!=0):
            n+=1
            if(n not in arr):
                k-=1
            
        return n
