<?php

class Solution {

    /**
     * @param String $s
     * @param String[] $wordDict
     * @return Boolean
     */
    function wordBreak($s, $wordDict) {
        $res = $s;
        $aLen = count($wordDict);

        for ($i = 0; $i < $aLen; $i++) {

            // echo str_contains($res, $wordDict[$i]) . PHP_EOL;

            if (str_contains($res, $wordDict[$i])) {
                $res = str_replace($wordDict[$i], '', $res);
            }
        }

        echo 'res: ' . $res . PHP_EOL;

        return strlen($res) == 0 ? true: false;
    }
}

$inputs = [
    // ['leetcode', ['leet', 'code']],
    // ['applepenapple', ['apple', 'pen']],
    // ['catsandog', ['cats', 'dog', 'sand', 'and', 'cat']],
    ["cars", ["car","ca","rs"]]
];

foreach ($inputs as $input) {
    $s = $input[0];
    $wordDict = $input[1];
    $result = (new Solution())->wordBreak($s, $wordDict);
    echo $result . PHP_EOL;
}
