<?php 

declare(strict_types=1);

class Solution {

    /**
     * @param array<int> $nums
     * @param int  $target
     * @return array<int>
     */
    function twoSum(array $nums, int $target): array {

        $len = count($nums);
        $map = [];

        for ($i = 0; $i < $len; $i++) {

            $complement = $target - $nums[$i];

            if (isset($map[$complement])) {

                return [$map[$complement], $i];
            }

            $map[$nums[$i]] = $i;
        }
    }
}

// Runtime: 4 ms Beats 99.89% of users with PHP
// Memory: 20.12 MB Beats 21.31% of users with PHP