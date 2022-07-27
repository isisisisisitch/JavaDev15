package ca.bytetube._00_interview;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * @author dal
 */
public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums1.length == 0) return;
        int i1 = m - 1;
        int i2 = n - 1;
        int cur = nums1.length - 1;

        //把nums2数组merge进nums1数组
        while (i2 >= 0){
            if (i1 >= 0 && nums2[i2] < nums1[i1]) {
                nums1[cur--] = nums1[i1--];

            }else {
                nums1[cur--] = nums2[i2--];
            }
        }

    }

}
