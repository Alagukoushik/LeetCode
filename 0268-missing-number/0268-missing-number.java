class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(int v:nums){
            if(v!=i){
                return i;
            }
            i++;
        }
        return nums[nums.length-1]+1;
    }
}