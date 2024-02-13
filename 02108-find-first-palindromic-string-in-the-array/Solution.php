<?php

class Solution {

    /**
     * @param String[] $words
     * @return String
     */
    public function firstPalindrome($words) {

        foreach ($words as $word) {

            if ($this->isPalindrome($word)) {
                return $word;
            }
        }

        return "";
    }

    /**
     * @param string $s
     * @return bool
     */
     public function isPalindrome($s): bool {
         $l = 0;
         $r = strlen($s) - 1;

         while ($l < $r) {

             if ($s[$l] !== $s[$r]) {
                 return false;
             }

             $l++;
             $r--;
         }

         return true;
     }
}
