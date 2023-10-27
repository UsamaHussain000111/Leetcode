<?php

declare(strict_types=1);

/**
 * @param array<int> $arr
 * @param int $i
 * @param int $j
 * @return void
 */
function swap(array &$arr, int $i, int $j): void {
    $temp = $arr[$i];
    $arr[$i] = $arr[$j];
    $arr[$j] = $temp;
}

/**
 * @param string $C
 * @return bool
 */
function isVowel(string $c): bool {
    $vowels = ['a', 'e', 'i', 'o', 'u'];
    return in_array(strtolower($c), $vowels);
}

class Solution {

    /**
     * @param string $s
     * @return string
     */
    function reverseVowels(string $s): string {
        $l = 0;
        $r = strlen($s) - 1;
        $arr = str_split($s);

        while($l < $r) {

            if(isVowel($arr[$l]) && isVowel($arr[$r])) {
                swap($arr, $l, $r);
                $l++;
                $r--;
            }else if(isVowel($arr[$l])) {
                $r--;
            }else {
                $l++;
            }
        }

        return implode($arr);
    }
}

// 34ms Beats 21.02% of users with PHP, 27.55MB Beats 26.12% of users with PHP