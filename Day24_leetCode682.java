class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> al=new ArrayList<>();
        int res=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C") && i>=1){
                al.remove(al.size()-1);
            }
            else if(operations[i].equals("D")){
                int t=al.get(al.size()-1)*2;
                al.add(t);
            }
            else if(operations[i].equals("+")){
                int t=al.get(al.size()-1) + al.get(al.size()-2);
                al.add(t);
            }
            else{
                al.add(Integer.valueOf(operations[i]));
            }
        }
        for(int x:al){
            res+=x;
        }
        return res;
    }
}
