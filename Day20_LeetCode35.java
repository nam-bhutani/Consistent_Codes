class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e =nums.length-1;
        int res=helper(nums,target,s,e);
        if(res==-1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>target) return i;
                if(i==nums.length-1) return nums.length;
            }
        }
        return res;
    }
    public int helper(int[] nums,int target,int s,int e){
        int mid=(s+e)/2;
        if(s>e) return -1;
        if(nums[mid]==target) 
            return mid;
        else if(nums[mid]<target) 
            return helper(nums,target,mid+1,e);
        else 
            return helper(nums,target,s,mid-1);
    }
}
