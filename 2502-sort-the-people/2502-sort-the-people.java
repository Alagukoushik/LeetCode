class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        String[] a=new String[n.length];
        HashMap<Integer,Integer> hp=new HashMap<>();
        int i=0;
        for(int v:h){
            hp.put(v,i);
            i++;
        }
        Arrays.sort(h);
        for(int v:h){
            a[--i]=n[hp.get(v)];
        }
        return a;
    }
}