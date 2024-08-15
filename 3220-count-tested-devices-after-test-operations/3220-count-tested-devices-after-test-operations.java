class Solution {
    public int countTestedDevices(int[] a) {
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
             c++;
             for(int j=i+1;j<a.length;j++){
                if(a[j]>0)
                   a[j]=a[j]-1;
                   System.out.print(a[j]);
             }
            }
        }
        return c;
    }
}