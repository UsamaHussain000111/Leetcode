func mergeAlternately(word1 string, word2 string) string {

	n := len(word1)
	m := len(word2)
	var res string

	for i := 0; i < n || i < m; i++ {

		if i < n {
			res += string(word1[i])
		}

		if i < m {
			res += string(word2[i])
		}
	}

	return res
}

// 0ms Beats 100.00% of users with Go, 2.82 MB Beats 12.72% of users with Go
