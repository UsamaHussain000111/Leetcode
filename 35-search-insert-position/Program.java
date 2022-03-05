// o (log n) solution using binary search
public class Program {
    public int searchInsert(int[] A, int target) {
        int low = 0;
        int high = A.length;
        while(low < high) 
        {
            int mid = low + ( high - low ) / 2; // low<=mid, mid<high
	        if( nums[mid] >= target) 
            {
                high = mid; // high always decreases (even high-low==1)
            }
	        else
            {
                low = mid + 1; // low always increases
            }
        }

        return low;
    }
}
