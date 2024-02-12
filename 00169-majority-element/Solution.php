<?php

class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    public function majorityElement($nums) {
        $n = count($nums);
        $hashMap = [];

        foreach ($nums as $num) {
            $hashMap[$num]++;
            
            if ($hashMap[$num] > $n / 2) {
                return $num;
            }
        }

        return -1;
    }
}
