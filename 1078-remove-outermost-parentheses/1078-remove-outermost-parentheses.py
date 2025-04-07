# class Solution:
#     def removeOuterParentheses(self, s: str) -> str:
#         p = 0
#         string = ""
#         c=0
#         for i in range(len(s)):
#             if(s[i]=='('):
#                 c+=1
#             else:
#                 c-=1
#             if c == 0:
#                 string+=s[p+1:i]
#                 p = i+1
                

        
#         return string

class Solution:
    def removeOuterParentheses(self, s:str) -> str:
        c = 0
        arr = []
        for i in s:
            if(i=='(' and c>0):
                arr.append("(")
                c+=1
            
            elif(i==')' and c>1):
                arr.append(")")
                c-=1
            elif(i=='('):
                c+=1
            else:
                c-=1
        return "".join(arr)