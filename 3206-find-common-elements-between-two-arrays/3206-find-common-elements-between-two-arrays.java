class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int add = 0;
        int add1 = 0;
        // comparing 1st array to 2nd array //
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    add++;
                    break;
                }
            }
        }
        // comparing 2nd array to 1st array //
          for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i] == nums1[j])
                {
                    add1++;
                    break;
                }
            }
        }
        return new int[]{add,add1};
    }
}