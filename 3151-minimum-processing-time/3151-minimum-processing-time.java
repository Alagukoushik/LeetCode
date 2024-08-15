class Solution {
    public int minProcessingTime(List<Integer> p, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(p,Collections.reverseOrder());
        int j=0;
        int ans=0;
        for(int v:p){
            for(int i=0;i<4;i++){
                ans=Math.max(ans,v+tasks.get(j));
                j++;
            }
        }
        return ans;
    }
}