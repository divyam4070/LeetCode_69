class Solution:
    def isPalindrome(self, x: int) -> bool:
        sum = 0
        temp = x
        while(x>0):
            r = x%10
            sum = (sum*10)+r
            x = x//10
        return sum == temp
        