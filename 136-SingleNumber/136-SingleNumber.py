# Last updated: 2/13/2026, 10:08:16 AM
class Solution(object):
    def singleNumber(self, nums):
     
        uniqNum = 0;
      
        for idx in nums:
           
            uniqNum ^= idx;
        return uniqNum;    