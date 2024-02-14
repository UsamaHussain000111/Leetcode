<?php

class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer[]
     */
    public function rearrangeArray($nums) {
        $pos = [];
        $neg = [];

        foreach ($nums as $num) {
            if ($num >= 0) {
                array_push($pos, $num);
                continue;
            }

            array_push($neg, $num);
        }

        $n = count($pos);
        $res = [];

        for ($i = 0; $i < $n; $i++) {
            array_push($res, $pos[$i]);
            array_push($res, $neg[$i]);
        }

        return $res;
    }
}
