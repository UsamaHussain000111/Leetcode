<?php

declare(strict_types=1);

class Solution {

    /**
     * @param string $operand
     * @return bool
     */
    public function isOperand(string $operand): bool {
        return ($operand >= 'a' && $operand <= 'z') || ($operand >= 'A' && $operand <= 'Z');
    }

    /**
     * @param string $c
     * @return int
     */
    public function operatorPrecedence(string $c): int {
        $res = -1;

        if ($c == '^') {
            $res = 3;
        }
        elseif ($c == '*' || $c == '/') {
            $res = 2;
        }
        elseif ($c == '+' || $c == '-') {
            $res = 1;
        }

        return $res;
    }

    /**
     * @param string $infix
     * @return string
     */
    public function infixToPostfix(string $infix): string {
        $len = strlen($infix);
        $stack = [];
        $res = '';

        for ($i = 0; $i < $len; $i++) {
            $c = $infix[$i];

            if ($this->isOperand($c)) {
                $res .= $c;
            }
            elseif ($c == '(') {
                array_push($stack, $c);
            }
            elseif ($c == ')') {
                // remove the elemenents from stack untill we found an opening bracket
                while (!empty($stack) && end($stack) != '(') {
                    $res .= array_pop($stack);
                }
                // remove the opening parentheses from stack
                array_pop($stack);
            }
            else {
                
                while(!empty($stack) && $this->operatorPrecedence(end($stack)) > $this->operatorPrecedence($c)) {
                    $res .= array_pop($stack);
                }
                // push the current operator to stack
                array_push($stack, $c);
            }
        }
        // push remaining elements from the stack
        while (!empty($stack)) {
            $res .= array_pop($stack);
        }

        return $res;
    }
}
