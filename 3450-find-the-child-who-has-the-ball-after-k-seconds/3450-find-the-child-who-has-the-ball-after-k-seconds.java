class Solution {
    public int numberOfChild(int n, int k) {
        int c=0;
        boolean f=false;
        for(int i=0;i<k;i++){
            if(c==0){
                f=false;
            }
            else if(c==n-1){
                f=true;
            }
            if(f){
                c--;
            }
            else{
                c++;
            }
        }
        return c;
    }
}