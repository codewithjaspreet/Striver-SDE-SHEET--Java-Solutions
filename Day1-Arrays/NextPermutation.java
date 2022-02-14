
// Intution 

// https://www.interviewbit.com/blog/next-permutation-problem/ 

// Time  - O(N) , space  - O(1)
// Algorithm :

//     Traverse the array from end and find the first index, idx such that A[i] < A[i + 1].
//     Again traverse the array from the end and find the first index, ind such that A[i] > A[idx].
//     Swap A[idx] and A[ind].
//     Reverse the array from idx + 1 till N.
//     The base case would be, if the array is in decreasing order, no next permutation will be found, hence return the array in sorted order.


public class NextPermutation {

    public void nextPermutation(int[] nums) {

        if (nums == null || nums.length <= 1)
            return;

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        if (i >= 0) {

            int j = nums.length - 1;
            while (nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1);

    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void reverse(int[] nums, int i, int j) {

        while (i < j)
            swap(nums, i++, j--);
    }
}
