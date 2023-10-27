<?php

class Solution {

    /**
     * @param array<int> $arr
     * @return bool
     */
    function uniqueOccurrences(array $arr): bool{
        $map1 = [];
        $map2 = [];

        foreach($arr as $num) {
            
            (isset($map1[$num]))? $map1[$num]++ : $map1[$num] = 1;
        }

        foreach($map1 as $value) {

            if(isset($map2[$value])) {
                return false;
            }

            $map2[$value] = true;
        }

        return true;
    }
}

// 3ms Beats 94.52% of users with PHP, 18.76MB Beats 97.26% of users with PHP