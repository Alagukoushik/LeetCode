class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> a=new ArrayList<>();
        int y=0;
        for(String v:words){
            for(char c:v.toCharArray()){
                if(x==c){
                    a.add(y);
                    break;
                }
            }
            y++;
        }
        return a;
    }
}