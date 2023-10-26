func kidsWithCandies(candies []int, extraCandies int) []bool {
	var maxCandies int
	for _, n := range candies {
		if maxCandies < n {
			maxCandies = n
		}
	}

	var res []bool
	for _, n := range candies {
		if (n + extraCandies) >= maxCandies {
			res = append(res, true)
			continue
		}
		res = append(res, false)
	}

	return res
}

// 2ms Beats 76.45% of users with Go, 2.40MB Beats 93.82% of users with Go