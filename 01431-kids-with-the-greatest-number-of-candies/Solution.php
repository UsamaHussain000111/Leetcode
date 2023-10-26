<?php

declare(strict_types=1);

class Solution {

    /**
     * @param array<int> $candies
     * @param int $extraCandies
     * @return array<bool>
     */
    function kidsWithCandies(array $candies, int $extraCandies): array {      
        $max = max($candies);
        return array_map(fn($kidCandies) => ($kidCandies + $extraCandies) >= $max, $candies);
    }
}

// 0ms beats 100.00% of users with PHP, 18.26MB beats 100.00% of users with PHP