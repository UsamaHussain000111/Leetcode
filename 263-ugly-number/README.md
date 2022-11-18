## [263. Ugly Number](https://leetcode.com/problems/ugly-number/)

$\color[RGB]{67,160,71} Easy$

An ***ugly number*** is a positive integer whose prime factors are limited to ```2```,```3```, and ```5```.

Given an integer ```n```, return ```true``` if ```n``` is an ***ugly number***.


***Example 1:***

<strong>Input:</strong> n = 6<br>
<strong>Output:</strong> true<br>
<strong>Explanation:</strong> 6 = 2 × 3<br>

***Example 2:***

<strong>Input:</strong> n = 1<br>
<strong>Output:</strong> true<br>
<strong>Explanation:</strong> 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.<br>

***Example 1:***

<strong>Input:</strong> n = 14<br>
<strong>Output:</strong> false<br>
<strong>Explanation:</strong> 14 is not ugly since it includes the prime factor 7.<br>

***Constraints:***

- -231 <= n <= 231 - 1