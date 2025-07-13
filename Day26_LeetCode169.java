class Solution {
    public int majorityElement(int[] nums) {
        int r=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(m==0) r=nums[i];
            m+= (nums[i]==r) ? 1 :-1;
        }
        return r;
    }
}
