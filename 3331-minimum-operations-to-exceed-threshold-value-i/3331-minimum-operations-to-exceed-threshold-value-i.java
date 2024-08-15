class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int a:nums){
            if(a<k){
                c++;
            }
        }
        return c;
    }
}