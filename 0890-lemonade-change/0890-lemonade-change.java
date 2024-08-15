class Solution {
    public boolean lemonadeChange(int[] bills) {
        int t5=0;
        int t1=0;
        int t2=0;
        for(int v:bills){
            if(v==5){
                t5+=5;
            }
            else if(v==10){
                if(t5-5>=0){
                    t5-=5;
                    t1+=10;
                }
                else{
                    return false;
                }
            }
            else{
                if(t1-10>=0&&t5-5>=0){
                    t1-=10;
                    t5-=5;
                }
                else if(t5-15>=0){
                    t5-=15;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}