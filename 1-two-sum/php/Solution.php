<?php

class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */

    function twoSum($nums, $target) {

        $map = [];
        $len = count($nums);

        for($i = 0 ; $i < $len ; $i++){

            $complement = $target - $nums[$i];

            if(array_key_exists($complement , $map)){
                return [ $map[$complement] , $i ];
            }

            $map[$nums[$i]] = $i;
        }

        throw InvalidArgumentException("Invalid Input");
    }
}

// Runtime 13 ms Beats 94.21% Memory 20.2 MB Beats 23.26%