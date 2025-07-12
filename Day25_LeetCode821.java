class Solution {
    public int[] shortestToChar(String s, char c) {
        //2 arr se min dist 
        List<Integer> id=new ArrayList<>();  
        int[] ans=new int[s.length()];  
          
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                id.add(i);
            }
        }
        for(int i=0;i<s.length();i++){
            int m=Integer.MAX_VALUE;
            for(int j:id){
                m=Math.min(Math.abs(j-i),m);
            }
            ans[i]=m;
        }
        return ans;
    }
}
