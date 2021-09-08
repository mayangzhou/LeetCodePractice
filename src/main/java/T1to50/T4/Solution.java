package T1to50.T4;

class Solution {
    int[] nums1;
    int[] nums2;
    boolean isOdd = false;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int size = length1 + length2;
        int ordered = 0,i = 0,j = 0,i2 = 0,j2 = 0;
        while(ordered < size /2 ){
            i2 = (i+(size/2 - ordered)/2);
            j2 = (j+(size/2 - ordered)/2);
            if (i2 < length1 && j2<length2){
                if (nums1[i2] < nums2[j2] ){
                    ordered += i2 - i + 1;
                    i = i2 + 1;
                }else{
                    ordered += j2 - j + 1;
                    j = j2 + 1;
                }
            }else if(i2 >= length1){
                if (size % 2 == 0){
                    return (double) (nums2[j + (size / 2 - ordered) - 1] + nums2[j + (size / 2 - ordered)])/2;
                }else {
                    return (double) nums2[j + (size / 2 - ordered)- 1];
                }
            }else if(j2 >= length2){
                if (size % 2 == 0){
                    return (double) (nums1[i + (size / 2 - ordered) - 1] + nums1[i + (size / 2 - ordered) ])/2;
                }else {
                    return (double) nums1[i + (size / 2 - ordered) - 1];
                }
            }
        }
        if(size % 2 == 0){
            return (double) (Math.max(nums1[i-1],nums2[j-1]) + Math.min(nums1[i],nums2[j]))/2;
        }else {
            return (double) Math.min(nums1[i],nums2[j]);
        }

    }

    public double myTwoInts(int i, int j, int k){
        // 找到前k小的
        if (k == 1){
            if (nums1 == null){
                if (isOdd){
                    return nums2[j];
                }else{
                    return nums2[j]+nums2[j+1];
                }

            }else if (nums2 == null){
                return nums1[i];
            }else {
                return Math.min(nums1[i],nums2[j] );
            }
        }else if (k == 0){
            return 0;
        }else{
            if (nums1 == null){
                return nums2[j + k - 1 ];
            }else if(nums2 == null){
                return nums1[i + k - 1];
            }else{
                if (nums1[i + k/2 ] < nums2[ j + k/2]){
                    return myTwoInts(i+k/2,j,k/2);
                }else{
                    return myTwoInts(i,j+k/2,k/2);
                }
            }
        }
    }
}