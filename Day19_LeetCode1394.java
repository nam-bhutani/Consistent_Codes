class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        int lucky=-1;
        for(int i:hs.keySet()){
            if(hs.get(i)==i){
                lucky=Math.max(lucky,i);
            }
        }
        return lucky;
    }
}
