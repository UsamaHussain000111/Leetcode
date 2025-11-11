<?php

class Solution {

    /**
     * @brief Intuition💡:
     * Iterative Approach:
     * Use two pointers: prev (starts as null) and curr (starts at head).
     * At each step:
     * 1 . Store curr.next in temp.
     * 2 . Reverse curr.next to point to prev.
     * 3 . Move prev to curr and curr to temp.
     * Repeat until curr is null.
     * prev becomes the new head of the reversed list.
     */
    
     /**
     * @param ListNode $head
     * @return ListNode
     */
    public function reverseList($head) {

        $prev = null;
        $current = $head;

        while($current != null) {
            $next = $current->next;
            $current->next = $prev;
            $prev = $current;
            $current = $next;
        }

        return $prev;
    }
}
