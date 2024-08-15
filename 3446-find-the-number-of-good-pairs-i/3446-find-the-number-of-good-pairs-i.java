class Solution {
    public int numberOfPairs(int[] a1, int[] a2, int k) {
        int c=0;
        for(int v:a1){
            for(int x:a2){
                if(v%(x*k)==0){
                    c++;
                }

            }
        }
        return c;
    }
}