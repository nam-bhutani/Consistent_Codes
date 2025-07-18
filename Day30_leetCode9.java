class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int sum=0;
        while(a>0){
            sum=sum*10+(a%10);
            a/=10;
        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }   
    }
}
