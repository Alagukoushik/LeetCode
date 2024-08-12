class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int v:arr){
            h.put(v,h.getOrDefault(v,0)+1);
        }
        for(int v:h.keySet()){
            if(a.contains(h.get(v))){
                return false;
            }
            a.add(h.get(v));
        }
        return true;
    }
}