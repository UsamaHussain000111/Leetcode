class Solution{

    public void merge(int[] nums1, int m, int[] nums2, int n){

        int p1 = m + n - 1;
        int p2 = n - 1;

        while(m <= p1){

            if(n > 0){

                nums1[p1] = nums2[p2];
                p1--;
                p2--;
            }
        }

        Arrays.sort(nums1);
    }
}

// a bit more optimized approach
public class Solution{

    public void merge(int[] nums1, int m, int[] nums2, int n){

        int j = 0;

        for (int i = m; i < m + n; i++){
            
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
    }
}

