class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        //friendChairs stores (leaving time, chairOccupiedNo)
        PriorityQueue<int[]> friendChairs = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        int n=times.length;
        Integer[] order = new Integer[n];
        
        for(int i=0; i<n; i++) order[i]=i;

        Arrays.sort(order, (a,b)->Integer.compare(times[a][0], times[b][0]));

        for(int i=0; i<n; i++){
            availableChairs.offer(i);
        }

        for(int i : order){
            int arrivalTime = times[i][0];
            int leavingTime = times[i][1];

            while(!friendChairs.isEmpty() && friendChairs.peek()[0]<=arrivalTime){
                availableChairs.offer(friendChairs.poll()[1]);
            }

            int newFriendChair = availableChairs.poll();
            friendChairs.offer(new int[] {leavingTime, newFriendChair});

            if(i==targetFriend){
                return newFriendChair;
            }
        }
        return -1;
    }
}