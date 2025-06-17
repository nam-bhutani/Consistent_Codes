class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        double median;
        double m1=0;
        double m2=0;
        int[] res=new int[m+n];
        int k=0;
        for(int i=0;i<n;i++){
            res[k++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            res[k++]=nums2[i];
        }
        Arrays.sort(res);
        if((m+n)%2==1){
            median=res[(m+n)/2];
        }
        else{
            m1=res[((m+n)/2) -1];
            m2=res[((m+n)/2)];
            median=(m1+m2)/2.0;
        }
        return median;
    
    }
}
