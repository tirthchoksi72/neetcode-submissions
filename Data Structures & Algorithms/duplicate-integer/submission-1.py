class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        Hashset = set()
        for i in nums:
            Hashset.add(i)
        if len(Hashset) != len(nums):
            return True
        return False 