class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count++;
            }
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        int[] temp=new int[hs.size()];
        int k=0;
        for(int x:hs.keySet()){
            if(x>0) temp[k++]=x;
            else if(count==nums.length) temp[k++]=x;
        
        }
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<temp.length;i++){
            curr+=temp[i];
            max=Math.max(curr,max);
            if(curr<0){
                curr=0;
            }
        }
        return max;
        
    }
}
