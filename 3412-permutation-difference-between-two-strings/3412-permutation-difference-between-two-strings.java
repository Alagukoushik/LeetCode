class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),i);
        }
        int sum=0;
        int i=0;
        for(char c:t.toCharArray()){
               sum+=Math.abs(i-h.get(c));
               i++;
        }
        return sum;
    }
}