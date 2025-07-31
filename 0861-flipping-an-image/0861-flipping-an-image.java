class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length; int last = n-1;
        for(int i =0; i<n ;i++){
            last = n-1;
            if(n%2==0){
                for(int j =0;j<n/2;j++){
                    int a;
                    image[i][j] ^= 1;
                    image[i][last]^=1;
                    a= image[i][last];
                    image[i][last]=image[i][j];
                    image[i][j]=a; last--;
                }
            }
            else{
                for(int j =0; j<=(n/2)+1;j++){
                    int a;
                    if(j==last) {image[i][j]=((image[i][j]==0)?1:0); break;}
                    image[i][j] ^= 1;
                    image[i][last]^=1;
                    a= image[i][last];
                    image[i][last]=image[i][j];
                    image[i][j]=a; last--;
                }
            }
        }
        return image;
    }
}