class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        p = 0
        string = ""
        c=0
        for i in range(len(s)):
            if(s[i]=='('):
                c+=1
            else:
                c-=1
            if c == 0:
                string+=s[p+1:i]
                p = i+1
                

        
        return string


        