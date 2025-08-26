class Solution {
    
    public String frequencySort(String s) {
        Map<Character, Integer> map  = new HashMap<>();
       for(char ch : s.toCharArray()){
        map.put(ch, map.getOrDefault(ch, 0)+1);
       } 

        StringBuilder sb = new StringBuilder();
       PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue()-a.getValue());
       maxHeap.addAll(map.entrySet());

       while(!maxHeap.isEmpty()){
        Map.Entry<Character, Integer> pair = maxHeap.poll();
        for(int i=0; i<pair.getValue(); i++){
            sb.append(pair.getKey());
        }
       }

       return sb.toString();
    }
}