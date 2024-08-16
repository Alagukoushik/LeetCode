class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int v:nums){
            int max=0;
            int i=0;
            while(v>0){
                int r=v%10;
                v/=10;
                if(r>max){
                    max=r;
                }
                i++;
            }
            int ans=max;
            for(int j=1;j<i;j++){
             ans=(ans*10)+max;
            }
            sum+=ans;
        }
        return sum;
    }
}