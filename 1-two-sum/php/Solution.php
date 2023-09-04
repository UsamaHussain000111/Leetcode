<?php

class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */

    function twoSum($nums, $target) {

        $map = [];

        for($i = 0 ; $i < count($nums) ; $i++){

            $complement = $target - $nums[$i];

            if(isset($map[$complement]))
                return [ $map[$complement] , $i ];

            $map[$nums[$i]] = $i;
        }

        throw InvalidArgumentException("Invalid Input");
    }
}

// Runtime: 4 ms Beats 99.89% of users with PHP
// Memory: 20.12 MB Beats 21.31% of users with PHP