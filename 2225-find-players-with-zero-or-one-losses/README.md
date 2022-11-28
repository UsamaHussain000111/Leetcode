## [2225. Find Players With Zero or One Losses](https://leetcode.com/problems/find-players-with-zero-or-one-losses/)

Medium

You are given an integer array ```matches``` where ```matches[i] = [winneri, loseri]``` indicates that the player ```winneri``` defeated player ```loseri``` in a match.

Return a list ```answer``` of size ```2``` where:

- ```answer[0]``` is a list of all players that have ***not*** lost any matches.
- ```answer[1]``` is a list of all players that have lost exactly ***one*** match.

The values in the two lists should be returned in ```increasing``` order.

***Note:***

- You should only consider the players that have played ***at least one*** match.
- The testcases will be generated such that ***no*** two matches will have the ***same*** outcome.


***Example 1:***

<strong>Example 1:</strong>  matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]<br>
<strong>Output:</strong> [[1,2,10],[4,5,7,8]]<br>
<strong>Explanation:</strong> Players 1, 2, and 10 have not lost any matches.<br>
Players 4, 5, 7, and 8 each have lost one match.<br>
Players 3, 6, and 9 each have lost two matches.<br>
Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].<br>

***Example 2:***

<strong>Input:</strong> matches = [[2,3],[1,3],[5,4],[6,4]]<br>
<strong>Output:</strong> [[1,2,5,6],[]]<br>
<strong>Explanation:</strong> Players 1, 2, 5, and 6 have not lost any matches.<br>
Players 3 and 4 each have lost two matches.<br>
Thus, answer[0] = [1,2,5,6] and answer[1] = [].<br>


***Constraints:***

- 1 <= matches.length <= 105
- matches[i].length == 2
- 1 <= winneri, loseri <= 105
- winneri != loseri
- All matches[i] are unique.