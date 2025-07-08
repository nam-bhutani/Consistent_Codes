class Solution {
    public void helper(List<String>ans, int opencount , int closedcount , String str , int n){
        if(opencount==n && closedcount==n){
            ans.add(str);
        }
        else{
            if(opencount > closedcount){
                helper(ans,opencount,closedcount+1,str+")",n);
            }
            if(opencount<n){
                helper(ans,opencount+1,closedcount,str+"(",n);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList();
        int opencount = 0;
        int closedcount = 0;
        String str = "";
        helper(ans,opencount,closedcount,str,n);
        return ans;
    }
}
