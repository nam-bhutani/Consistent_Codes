class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int count=1;
        int lastE=pairs[0][1];
        for(int i=1; i < pairs.length; i++){
            if(lastE < pairs[i][0]){
                lastE = pairs[i][1];
                count++;
            }
        }
        return count;

    }
}
