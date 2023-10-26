<?php

declare(strict_types=1);

class Solution {

    /**
     * @param string $word1
     * @param string $word2
     * @return string
     */
    function mergeAlternately(string $word1, string $word2): string {

        $len = max(strlen($word1), strlen($word2));
        $res = '';
        
        for($i = 0; $i < $len; $i++) {
            
            $res .= $word1[$i] . $word2[$i];
        }
        
        return $res; 
    }
}