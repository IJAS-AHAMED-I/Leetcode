class Solution {
    public List<Integer> findPeaks(int[] A) {
        List<Integer> B=new ArrayList<>();
        for(int i=1;i<A.length-1;i++){
            if(A[i]>A[i-1]&&A[i]>A[i+1]){
                B.add(i);
            }
        }
        return B;
    }
}
        