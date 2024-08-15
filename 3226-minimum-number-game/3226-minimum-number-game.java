class Solution {
    public int[] numberGame(int[] nums) {
        int[] a=new int[nums.length];
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i+=2){
            a[i-1]=nums[i];
            a[i]=nums[i-1];
        }
        return a;
    }
}