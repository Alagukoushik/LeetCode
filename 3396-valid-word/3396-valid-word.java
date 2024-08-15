class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        ArrayList<Character> a=new ArrayList<>();
        a.add('a');
        a.add('e');
        a.add('i');
        a.add('o');
        a.add('u');
        a.add('A');
        a.add('E');
        a.add('I');
        a.add('O');
        a.add('U');
        boolean f1=false;
        boolean f2=false;
        for(char c:word.toCharArray()){
            if(a.contains(c)){
                f1=true;
            }
            else if(!Character.isDigit(c)&&!Character.isLetter(c)){
                return false;
            }
        }
        for(char c:word.toCharArray()){
            if(!a.contains(c)&&Character.isLetter(c)){
                f2=true;
                break;
            }
        }
        if(f1&&f2){
            return true;
        }
        return false;
    }
}