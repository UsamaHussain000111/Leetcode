<?php

declare(strict_types=1);

class Solution {

    /**
     * @param array<int> $flowerbed
     * @param int $n
     * @return bool
     */
    function canPlaceFlowers(array $flowerbed, int $n): bool {
        $len = count($flowerbed);
        $i = 0;

        while($i < $len) {

            if($flowerbed[$i] == 1) {
                $i += 2;
                continue;
            }
            
            if($flowerbed[$i] == 0 && $flowerbed[$i + 1] == 0) {
                $n--;
                $i += 2;
                continue;
            }

            $i++;
        }

        return $n <= 0;
    }
}

// 48ms Beats 31.72% of users with PHP, 20.88MB Beats 62.37% of users with PHP