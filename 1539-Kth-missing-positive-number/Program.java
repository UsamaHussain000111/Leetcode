// o (log n) solutions

// solution 1
// https://leetcode.com/problems/kth-missing-positive-number/discuss/779999/JavaC%2B%2BPython-O(logN)

public int findKthPositive(int[] A, int k) {
    int l = 0, r = A.length, m;
    while (l < r) {
        m = (l + r) / 2;
        if (A[m] - 1 - m < k)
            l = m + 1;
        else
            r = m;
    }
    return l + k;
}

// solution 2
// https://leetcode.com/problems/kth-missing-positive-number/discuss/780201/Java-O(lgN)-binary-Search

public int findKthPositive(int[] arr, int k) {
    int l = 0, r = arr.length;
    while (l < r) {
        int mid = l + (r - l) / 2;
        if (arr[mid] - (mid + 1) >= k) r = mid;  //missed more or equal than k numbers, left side;
        else l = mid + 1;   // missed less than k numbers, must be in the right side;
    }
    return l + k;
}

// solution 3
// https://leetcode.com/problems/kth-missing-positive-number/discuss/989661/Java-Binary-search-O(log(n))-0ms-time-O(1)-space-explained

public int binarySearch(int[] arr, int k, int leftI, int rightI)
{
	int amountOfmissingNums = 0;
	if(leftI >= rightI) //end condition
	{
		amountOfmissingNums = arr[leftI] - leftI - 1;
		if(amountOfmissingNums >= k) //go left
		{
			k = amountOfmissingNums - k + 1;
			return arr[leftI] - k; 
		}
		else //smaller go right
		{
			k = k - amountOfmissingNums;
			return arr[leftI] + k;
		}
	}
	int midI = (leftI + rightI) / 2;
	amountOfmissingNums = arr[midI] - midI - 1;
	if(amountOfmissingNums >= k) // search left
		return binarySearch(arr, k, leftI, midI - 1); 
	else //search right
		return binarySearch(arr, k, midI + 1, rightI);
}