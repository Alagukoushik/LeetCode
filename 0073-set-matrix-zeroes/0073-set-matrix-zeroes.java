class Solution {
    public void setZeroes(int[][] a) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==0){
                     h1.add(i);
                     h2.add(j);
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(h1.contains(i)||h2.contains(j)){
                     a[i][j]=0;
                }
            }
        }
    }
}