class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        n = len(nums)
        l = 0
        r = l + 1

        while r < n:

            if nums[l] != 1:
                l += 1
                r = l + 1
                continue
            
            if nums[r] != 1:
                r += 1
                continue
            
            diff = r - (l + 1)

            if diff < k:
                return False
            
            l = r
            r = l + 1
    
        return True
        

# more pythonic way

class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        prev = -1

        for i, val in enumerate(nums):
            if val == 1:
                if prev is not -1 and i - prev - 1 < k:
                    return False
                prev = i
    
        return True
        