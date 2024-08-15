class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int ans=0;
        for(char v:s.toCharArray()){
            if(v=='E'){
                c++;
            }
            else{
                c--;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}