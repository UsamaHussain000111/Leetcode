package main

func twoSum(nums []int, target int) []int {

	hashMap := make(map[int]int)

	for i := 0; i < len(nums); i++ {

		if val, ok := hashMap[target-nums[i]]; ok {
			return []int{val, i}
		}
		hashMap[nums[i]] = i
	}

	return nil
}

// Runtime 4ms Beats 84.56%of users with Go
// Memory 4.33 MB Beats 14.14%of users with Go
