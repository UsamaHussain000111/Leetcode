<?php

class Solution {

    /**
     * @param Integer[] $prices
     * @return Integer
     */

    function maxProfit($prices) {

        $buy = $prices[0];
        $maxProfit = 0;

        for($i = 1 ; $i < count($prices) ; $i++){

            $currBuy = min($buy , $prices[$i]);
            $maxProfit = max($prices[$i] - $currBuy , $maxProfit);

            $buy = $currBuy;
        }

        return $maxProfit;
    }
}