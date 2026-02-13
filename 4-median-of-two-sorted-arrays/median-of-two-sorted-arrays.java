class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] marged = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                marged[k++] = nums1[i++];
            } else{
                marged[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            marged[k++] = nums1[i++];
        }
        while(j < nums2.length){
            marged[k++] = nums2[j++];
        }
        int n = marged.length;
        if(n%2 == 1){
            return marged[n/2];
        } else{
            return (marged[n/2-1] + marged[n/2]) / 2.0;
        }
    }
}