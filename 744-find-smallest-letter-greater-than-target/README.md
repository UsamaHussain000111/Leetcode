## [744. Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)

$\color[RGB]{67,160,71} Easy$

You are given an array of characters ```letters``` that is sorted in ***non-decreasing order***, and a character ```target```. There are at ***least two different*** characters in ```letters```.

Return the smallest character in ```letters``` that is lexicographically greater than ```target```. If such a character does not exist, return the first character in ```letters```.


***Example 1:***

<strong>Example 1:</strong>  letters = ["c","f","j"], target = "a"<br>
<strong>Output:</strong> "c"<br>
<strong>Explanation:</strong> The smallest character that is lexicographically greater than 'a' in letters is 'c'.<br>

***Example 2:***

![alt text](https://assets.leetcode.com/uploads/2020/06/10/screen-shot-2020-06-10-at-123843-pm.png)

<strong>Input:</strong> letters = ["c","f","j"], target = "c"<br>
<strong>Output:</strong> "f"<br>
<strong>Explanation:</strong> The smallest character that is lexicographically greater than 'c' in letters is 'f'.<br>

***Example 3:***

![alt text](https://assets.leetcode.com/uploads/2020/06/10/screen-shot-2020-06-10-at-123843-pm.png)

<strong>Input:</strong> letters = ["x","x","y","y"], target = "z"<br>
<strong>Output:</strong> "x"<br>
<strong>Explanation:</strong> There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].<br>


***Constraints:***

- 2 <= letters.length <= 104
- letters[i] is a lowercase English letter.
- letters is sorted in ***non-decreasing*** order.
- letters contains at least two different characters.
- target is a lowercase English letter.