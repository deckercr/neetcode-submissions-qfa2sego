class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for num in nums:
            before = len(seen)
            seen.add(num)
            after = len(seen)
            if before == after:
                return True
        return False