class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arraySize = nums.length;
        int[] result = new int[2];
        for(int i = 0; i< arraySize; i++){
            for(int j = i+1; j<arraySize;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}