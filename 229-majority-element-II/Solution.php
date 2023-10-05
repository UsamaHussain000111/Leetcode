<?php

class Solution {
    /**
     * @param Integer[] $nums
     * @return Integer[]
     */
    function majorityElement($nums) {
        $len = count($nums);
        $times = floor($len / 3);

        $map = [];
        $res = [];

        foreach($nums as $num) {
            (isset($map[$num]))? $map[$num]++ : $map[$num] = 1;
            if(($map[$num] > $times) && (!in_array($num, $res))) {
                $res[] = $num;
            }
        }

        return $res;
    }
}

/**
 * time: O(n)
 * space: O(n)
 * 
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 */