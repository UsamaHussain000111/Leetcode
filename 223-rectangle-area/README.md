## [223. Rectangle Area](https://leetcode.com/problems/rectangle-area/)

$\color[RGB]{239,108,0} Medium$

Given the coordinates of two ***rectilinear*** rectangles in a 2D plane, return the total area covered by the two rectangles.

The first rectangle is defined by its ***bottom-left*** corner ```(ax1, ay1)``` and its ***top-right*** corner ```(ax2, ay2)```.

The second rectangle is defined by its ***bottom-left*** corner ```(bx1, by1)``` and its ***top-right*** corner ```(bx2, by2)```.

***Example 1:***

![alt text](https://assets.leetcode.com/uploads/2021/05/08/rectangle-plane.png)

<strong>Input:</strong> ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2<br>
<strong>Output:</strong> 45<br>

***Example 2:***

<strong>Input:</strong> ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2<br>
<strong>Output:</strong> 16<br>


***Constraints:***

- -104 <= ax1 <= ax2 <= 104
- -104 <= ay1 <= ay2 <= 104
- -104 <= bx1 <= bx2 <= 104
- -104 <= by1 <= by2 <= 104