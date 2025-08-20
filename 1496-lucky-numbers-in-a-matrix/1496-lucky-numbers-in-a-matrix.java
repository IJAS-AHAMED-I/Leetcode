class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List <Integer> res=new ArrayList<>();
        int m=matrix[0].length;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            int min=matrix[i][0];
            int col=0;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean lucky=true;
            for(int k=0;k<n;k++){
                if(matrix[k][col]>min){
                    lucky=false;
                    break;
                }
            }
            if(lucky)
            res.add(min);
        }
        return res;
    }
}