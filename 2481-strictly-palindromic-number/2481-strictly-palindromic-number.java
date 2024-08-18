class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String s="";
        while(n>0){
            s+=n%2;
            n/=2;
        }
        System.out.print(s);  
        return false; 
    }
}