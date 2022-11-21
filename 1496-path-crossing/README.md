## [1496. Path Crossing](https://leetcode.com/problems/path-crossing/)

$\color[RGB]{67,160,71} Easy$

Given a string ```path```, where ```path[i] = 'N', 'S', 'E'``` or ```'W'``` , each representing moving one unit north, south, east, or west, respectively. You start at the origin ```(0, 0)``` on a 2D plane and walk on the path specified by ```path```.

Return ```true``` if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return ```false``` otherwise.


***Example 1:***

![alt text](https://assets.leetcode.com/uploads/2020/06/10/screen-shot-2020-06-10-at-123929-pm.png)

<strong>Input:</strong>  path = "NES"<br>
<strong>Output:</strong> false<br>
<strong>Explanation:</strong> Notice that the path doesn't cross any point more than once.<br>

***Example 2:***

![alt text](https://assets.leetcode.com/uploads/2020/06/10/screen-shot-2020-06-10-at-123843-pm.png)

<strong>Input:</strong> path = "NESWW"<br>
<strong>Output:</strong> true<br>
<strong>Explanation:</strong> Notice that the path visits the origin twice.<br>


***Constraints:***

- 1 <= path.length <= 104
- path[i] is either 'N', 'S', 'E', or 'W'.