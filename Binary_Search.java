public class Binary_Search {
    public static void main(String[] args) {
        // description
        // Given an array of integers nums which is sorted in ascending order, and an
        // integer target, write a function to search target in nums. If target exists,
        // then return its index. Otherwise, return -1.

        // You must write an algorithm with O(log n) runtime complexity.
        // link
        //https://leetcode.com/problems/binary-search/description/
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        int ind = search(arr, target);
        System.out.println(ind); 
    }

    public static int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1, m = s + (e - s) / 2;
        while (s <= e) {
            m = s + (e - s) / 2;
            if (nums[m] == target)
                return m;
            else if (nums[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        return -1;

    }
}
