class Solution {
    public void sortColors(int[] nums) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest = Math.max(nums[i],largest);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
    }
}
