class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        int x = (n & (n-1));
        return (x==0);
    }
}