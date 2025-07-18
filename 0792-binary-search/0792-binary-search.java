class Solution {
    public int search(int[] nums, int target) {
        int L=0;
        int R=nums.length-1;
        while(L<=R){
           int mid=L+(R-L)/2;
            if(nums[mid]==target){
                return mid;}
                else if(nums[mid]>target){
                 R=mid-1;
                }
                
            else {//if(mid<target){
                L=mid+1;
            }
        }
        return -1;
    }
    public int [] bubbleSort(int[]nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}