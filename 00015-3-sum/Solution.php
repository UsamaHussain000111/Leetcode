<?php

class Solution {

    /**
     * Intuition & Approach:
     * ---------------------
     * The goal is to find all unique triplets in the array that sum up to zero.
     *
     * 1. **Sorting**:
     *    We first sort the array so that we can use the two-pointer approach.
     *    Sorting helps to easily avoid duplicates and efficiently move the pointers.
     *
     * 2. **Fixing one element and using two pointers**:
     *    - We iterate over each element `nums[i]` as the first element of a potential triplet.
     *    - For each `i`, we set two pointers:
     *         - `l` (left) → starting from `i + 1`
     *         - `r` (right) → starting from the end of the array.
     *
     * 3. **Two-pointer search**:
     *    - Compute `threeSum = nums[i] + nums[l] + nums[r]`
     *    - If `threeSum > 0`, we move `r--` (we need smaller numbers).
     *    - If `threeSum < 0`, we move `l++` (we need larger numbers).
     *    - If `threeSum == 0`, we found a valid triplet:
     *        - Add it to the result.
     *        - Move `l++` (and skip duplicates for `l`).
     *
     * 4. **Skipping duplicates**:
     *    - We skip the same `nums[i]` as before to ensure unique triplets.
     *    - Also, when we find a valid triplet, we move `l` forward skipping duplicate values.
     *
     * 5. **Result**:
     *    The algorithm ensures all triplets are unique and efficiently found using sorting and two-pointer logic.
     *
     * ---------------------
     * Time Complexity:
     * ---------------------
     * - Sorting the array: O(n log n)
     * - Outer loop (over i): O(n)
     * - Inner two-pointer traversal: O(n) in total for each i
     * → Overall = **O(n²)**
     *
     * ---------------------
     * Space Complexity:
     * ---------------------
     * - Sorting (depends on sorting algorithm): O(log n) for recursion stack (if using quicksort)
     * - Result storage: O(k) for k valid triplets (output space)
     * → **O(1)** auxiliary space (excluding output)
     *
     * ---------------------
     * Possible Improvements:
     * ---------------------
     * - The algorithm is already optimal for the 3Sum problem (cannot do better than O(n²)).
     * - For smaller constant factors:
     *     * Use early breaks if `nums[i] > 0` since further sums will exceed zero.
     *     * Use hashing (less efficient in practice for 3Sum due to duplicates).
     */

    /**
     * @param Integer[] $nums
     * @return Integer[][]
     */
    function threeSum($nums) {
        $res = [];
        sort($nums);
        $n = count($nums);

        for ($i = 0; $i < $n; $i++) {

            // Skip duplicate elements to ensure unique triplets
            if ($i > 0 && $nums[$i] == $nums[$i - 1]) {
                continue;
            }

            $l = $i + 1;
            $r = $n - 1;

            while ($l < $r) {
                $threeSum = $nums[$i] + $nums[$l] + $nums[$r];

                if ($threeSum > 0) {
                    $r--;
                } else if ($threeSum < 0) {
                    $l++;
                } else {
                    $res[] = [$nums[$i], $nums[$l], $nums[$r]];
                    $l++;

                    // Skip duplicates for the second number
                    while ($l < $r && $nums[$l] == $nums[$l - 1]) {
                        $l++;
                    }
                }
            }
        }

        return $res;
    }
}
