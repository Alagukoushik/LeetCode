class Solution {
    public int percentageLetter(String s, char letter) {
        int x=0;
        for(char c:s.toCharArray()){
            if(c==letter){
                x++;
            }
        }
        
        return (x*100)/s.length();
    }
}