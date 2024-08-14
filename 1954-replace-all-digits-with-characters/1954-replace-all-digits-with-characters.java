class Solution {
    public String replaceDigits(String s) {
        String s1="";
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
             if(Character.isDigit(a[i])){
                int t=(int)a[i-1]+Integer.valueOf(a[i]+"");
                s1+=(char)t;
             }
             else{
                s1+=a[i];
             }
        }
        return s1;
    }
}