// My orignal solution
//Runtime: 1 ms, faster than 98.85% , Memory Usage: 41.8 MB, less than 52.48%

class Solution {
    public int findNumbers(int[] nums) {
        int evenNumberOfDigits = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            int count = 0;
            while(nums[i] != 0)
            {
                nums[i] /= 10;
                count++;
            }
            
            if(count % 2 == 0)
            {
                evenNumberOfDigits++;
            }
        }
        
        return evenNumberOfDigits;
    }
}

// These are good solutions from description

// by playing with constraints

class Solution{
    public int findNumbers(int[] nums) {
        
        int count=0;
        
        for(int i =0 ; i< nums.length; i++){
            
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        
        return count;
        
    }
}

// logarithms are your friends.

public class Solution {
    public int FindNumbers(int[] nums) {
        
        if(nums == null || nums.Length == 0)
            return 0;
        
        int cnt = 0;
        foreach(int num : nums)
        {
            if((Math.Floor(Math.Log10(num) + 1)) % 2 == 0)
                cnt++;
        }
        
        return cnt;
    }
}