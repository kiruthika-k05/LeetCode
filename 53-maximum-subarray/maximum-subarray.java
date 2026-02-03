class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int MSF = Integer.MIN_VALUE;
        int ME = 0;
        for(int i = 0; i < n; i++){
            ME+=nums[i];
            if(ME > MSF){
                MSF = ME;
            }
            if(ME < 0){
                ME = 0;
            }
        }
        return MSF;
    }
}