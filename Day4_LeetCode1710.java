class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int count=0;
        Arrays.sort(boxTypes, Comparator.comparingDouble(o->o[1]));
        for(int i=boxTypes.length-1;i>=0;i--){
            if(truckSize >= boxTypes[i][0]){
                truckSize =truckSize - boxTypes[i][0];
                count+= (boxTypes[i][0]*boxTypes[i][1]);
            }
            else{    
                count+=truckSize * boxTypes[i][1];
                truckSize=0;
            }
        }
        return count;
    }
