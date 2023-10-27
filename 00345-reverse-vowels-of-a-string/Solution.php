<?php

class Solution {

    function swap(array &$arr, int $i, int $j): void {
        $temp = $arr[$i];
        $arr[$i] = $arr[$j];
        $arr[$j] = $temp;
    }

    function isVowel(string $c): bool {
        $vowels = ['a', 'e', 'i', 'o', 'u'];
        return in_array(strtolower($c), $vowels);
    }


    /**
     * @param String $s
     * @return String
     */
    function reverseVowels($s) {
        $l = 0;
        $r = strlen($s) - 1;
        $arr = str_split($s);

        while($l < $r) {

            if($this->isVowel($arr[$l]) && $this->isVowel($arr[$r])) {
                $this->swap($arr, $l, $r);
                $l++;
                $r--;
            }else if($this->isVowel($arr[$l])) {
                $r--;
            }else {
                $l++;
            }
        }

        return implode($arr);
    }
}