class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        while(true){
            int sum=0;
            while(n>0){
                int r=n%10;
                n/=10;
                sum+=r*r;
            }
            if(sum==1){
                return true;
            }
            if(a.contains(sum)){
                return false;
            }
            a.add(sum);
            n=sum;
        }
        
    }
}