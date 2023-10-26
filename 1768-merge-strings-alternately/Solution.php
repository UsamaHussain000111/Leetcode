<?php

class Solution {

    /**
     * @param String $word1
     * @param String $word2
     * @return String
     */
    function mergeAlternately($word1, $word2) {

        $len = max(strlen($word1), strlen($word2));
        $res = '';
        
        for($i = 0; $i < $len; $i++) {
            
            $res .= $word1[$i] . $word2[$i];
        }
        
        return $res; 
    }
}