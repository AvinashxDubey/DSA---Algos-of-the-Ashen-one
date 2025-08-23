class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ls = new ArrayList<>();
        
        int i=0, j=0;
        while(i<firstList.length && j<secondList.length){
            int potStart = Math.max(firstList[i][0], secondList[j][0]);
            int potEnd = Math.min(firstList[i][1], secondList[j][1]);

            if(potStart<=potEnd){
                ls.add(new int[]{potStart, potEnd});
            } 

            if(firstList[i][1]<secondList[j][1]){
                i++;
            }
            else{
                j++;
            }
        }

        return ls.toArray(new int[ls.size()][2]);
    }
}