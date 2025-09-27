class Solution {
    public int countLargestGroup(int n) {
        int count=0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=1; i<=n; i++){
            int num=i, digiSum = 0;
            while(num>0){
                digiSum+=num%10;
                num/=10;
            }
            map.put(digiSum, map.getOrDefault(digiSum, 0)+1);
        }
        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int key = e.getKey();
            int val = e.getValue();
            if(val>maxFreq){
                maxFreq = val;
                count=1;
            }
            else if(val==maxFreq) count++;
        }
        return count;
    }
}