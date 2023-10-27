<?php

declare(strict_types=1);

/**
 * calculates the greatest common divisor (aka HCF)
 * 
 * @param int $num1
 * @param int $num2
 * @return int
 */
function gcd(int $a, int $b): int {
    
    while ($b !== 0) {
        $temp = $b;
        $b = $a % $b;
        $a = $temp;
    }

    return $a;
}
    
class Solution {

    /**
     * @param string $str1
     * @param string $str2
     * @return string
     */
    function gcdOfStrings(string $str1, string $str2): string {
        
        if ($str1 . $str2 !== $str2 . $str1) {
            return "";
        }

        return substr($str1, 0, gcd(strlen($str1), strlen($str2)));
    }
}

// 14ms Beats 22.32% of users with PHP, 18.93MB Beats 73.21% of users with PHP