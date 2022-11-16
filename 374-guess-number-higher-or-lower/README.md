## [374. Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)

$\color[RGB]{67,160,71} Easy$

We are playing the Guess Game. The game is as follows:

I pick a number from ```1``` to ```n```. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API ```int guess(int num)```, which returns three possible results:

- ```-1```: Your guess is higher than the number I picked (i.e. ```num > pick```).
- ```1```: Your guess is lower than the number I picked (i.e. ```num < pick```).
- ```0```: your guess is equal to the number I picked (i.e. ```num == pick```).

***Example 1:***

<strong>Input:</strong> n = 10, pick = 6<br>
<strong>Output:</strong> 6<br>

***Example 2:***

<strong>Input:</strong> n = 1, pick = 1<br>
<strong>Output:</strong> 1<br>

***Example 3:***

<strong>Input:</strong> n = 2, pick = 1<br>
<strong>Output:</strong> 1<br>


***Constraints:***

- 1 <= n <= 231 - 1
- 1 <= pick <= n