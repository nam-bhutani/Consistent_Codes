class Solution {
    public String toLowerCase(String s) {
        String k="";
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)>=65 && s.charAt(i)<=90){
            k+=(char)(s.charAt(i)+32);
           }
           else{
            k+=s.charAt(i);
           }
        }
        return k;
    }
}
