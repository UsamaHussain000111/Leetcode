<?php

class Solution{

    /**
     * @param Integer[] $nums
     * @return Boolean
     */

    function containsDuplicate($nums){

        $set = array();

        foreach($nums as $num){

            if(isset($set[$num]))
                return true;
            
            $set[$num] = true;
        }

        return false;
    }
}