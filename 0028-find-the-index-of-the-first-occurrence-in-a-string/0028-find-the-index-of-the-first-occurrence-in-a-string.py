class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        
        for i in range(len(haystack)-len(needle)+1):
            if haystack[i:i+len(needle)] == needle:
                return i
        
        return -1

# class Solution:
#     def strStr(self, haystack: str, needle: str) -> int:

#         if len(haystack) < len(needle):
#             return -1

#         for i in range(len(haystack)):
#             if haystack[i:i+len(needle)] == needle:
#                 return i

#         return -1 
        