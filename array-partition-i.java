// Time Complexity : O(NlogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public int arrayPairSum(int[] nums) {
        //base case
        if(nums == null || nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
            sum+=nums[i];
        return sum;
    }
}
