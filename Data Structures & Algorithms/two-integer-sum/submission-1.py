class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        values = dict()

        for index, element in enumerate(nums):
            compliment = target - element

        
            if compliment in values:

                return [values[compliment], index]

            values[element] = index

        return []