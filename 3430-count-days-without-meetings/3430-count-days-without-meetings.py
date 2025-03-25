class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        meetings.sort(key = lambda x: x[0])
        print(meetings)
        res = 0
        bada = 0
        # for i in range(len(meetings)-1):
        #     if meetings[i+1][0]>meetings[i][1]:
        #         res+=(meetings[i+1][0]-meetings[i][1])
        for i in meetings:
            if i[0]>bada+1:
                res+=i[0]-bada-1
            bada = max(bada, i[1])
        return res + days-bada

        # bada = 3
        # 5-3+1
        