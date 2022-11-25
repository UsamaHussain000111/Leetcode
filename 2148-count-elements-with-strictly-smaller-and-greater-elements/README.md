## [2148. Count Elements With Strictly Smaller and Greater Elements](https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/)

$\color[RGB]{67,160,71} Easy$

Given an integer array ```nums```, return the number of elements that have ***both*** a strictly smaller and a strictly greater element appear in ```nums```.

Return the smallest character in ```letters``` that is lexicographically greater than ```target```. If such a character does not exist, return the first character in ```letters```.


***Example 1:***

<strong>Example 1:</strong>  nums = [11,7,2,15]<br>
<strong>Output:</strong> 2<br>
<strong>Explanation:</strong> The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.<br>

***Example 2:***

<strong>Input:</strong> nums = [-3,3,3,90]<br>
<strong>Output:</strong> 2<br>
<strong>Explanation:</strong> The smallest character that is lexicographically greater than 'c' in letters is 'f'.<br>

***Example 3:***

<strong>Input:</strong> letters = ["x","x","y","y"], target = "z"<br>
<strong>Output:</strong> "x"<br>
<strong>Explanation:</strong> The element 3 has the element -3 strictly smaller than it and the element 90 strictly greater than it.
Since there are two elements with the value 3, in total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.<br>


***Constraints:***

- 1 <= nums.length <= 100
- -105 <= nums[i] <= 105