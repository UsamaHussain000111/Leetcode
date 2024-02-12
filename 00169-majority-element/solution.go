func majorityElement(nums []int) int {
	hashMap := make(map[int]int)

	for _, num := range nums {
		hashMap[num]++

		if hashMap[num] > len(nums)/2 {
			return num
		}
	}

	return -1
}