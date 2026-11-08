class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        count = 0
        maxcnt = 0
        for i in nums:
            if i == 1:
                count += 1
                maxcnt = max(maxcnt, count)
            else:
                
                count = 0
        
        return maxcnt