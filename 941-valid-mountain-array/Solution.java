class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length , left = 0 , right = n - 1;
        if(n < 3) return false;
        while(left < right){
            if(arr[left] < arr[left + 1]) left++;
            else if(arr[right] < arr[right - 1]) right--;
            else break;
        }
        return left != 0 && right != n - 1 && left == right;
    }
}