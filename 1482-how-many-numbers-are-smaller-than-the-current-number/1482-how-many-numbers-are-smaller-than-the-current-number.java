class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++)
            list.add(GetCounterNums(nums , nums[i]));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private Integer GetCounterNums(int[] nums, int num) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++)
            if(num > nums[i])
                counter++;  
        
        return counter;
    }
}