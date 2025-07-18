class Solution {
    public int missingNumber(int[] nums) {
        int sumA=0;
        int sumB=0;
        for(int i=0;i<nums.length;i++){
            sumA+=i+1;
            sumB+=nums[i];
        }return (sumA-sumB);
    }
}