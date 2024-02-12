<?php

class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer[]
     */
    public function leftRightDifference($nums) {
        $prefix = 0;
        $postfix = 0;
        $len = count($nums);

        $res = [];
        $res[0] = 0;

        for ($i = 1; $i < $len; $i++) {
            $prefix += $nums[$i - 1];
            $res[$i] = $prefix;
        }
        
        for ($i = $len - 2; $i >= 0; $i--) {
            $postfix += $nums[$i + 1];
            $res[$i] = abs($res[$i] - $postfix);
        }

        return $res;
    }
}
