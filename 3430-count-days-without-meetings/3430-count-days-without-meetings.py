class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        meetings.sort(key = lambda x: x[0])
        if days == 1:
            return 0
        res = 0
        bada = 0
        for i in meetings:
            if i[0]>bada+1:
                res+=i[0]-bada-1
            bada = max(bada, i[1])
        return res + days-bada
        