class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        int n = nums.length;
        int result[] = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            if(!d.isEmpty() && d.peekFirst() <= i - k){
                d.pollFirst();
            }
            while(!d.isEmpty() && nums[d.peekLast()] < nums[i]){
                d.pollLast();
            }
            d.addLast(i);
            if(i >= k - 1){
                result[i - k + 1] = nums[d.peekFirst()];
            }
        }
        return result;
    }
}