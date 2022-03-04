public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int firstPointer = 0;
        int secondPointer = height.length - 1;
        while(firstPointer < secondPointer)
        {
            if(height[firstPointer] < height[secondPointer])
            {
                maxArea = Math.max(maxArea , height[firstPointer] * (secondPointer - firstPointer) );
                firstPointer++;
            }
            else
            {
                maxArea = Math.max(maxArea , height[secondPointer] * (secondPointer - firstPointer) );
                secondPointer--;
            }
        }
        
        return maxArea;
    }
}
