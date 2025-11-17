<?php

class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $k
     * @return Boolean
     */
    function kLengthApart($nums, $k) {
        $n = count($nums);
        $l = 0;
        $r = $l + 1;
        
        while ($r < $n) {
        
            if ($nums[$l] != 1) {
                $l++;
                $r = $l + 1;
                continue;
            }

            if ($nums[$r] != 1) {
                $r++;
                continue;
            }

            $diff = $r - ($l + 1);

            if ($diff < $k) {
                return false;
            }

            $l = $r;
            $r = $l + 1;
        }

        return true;
    }
}
